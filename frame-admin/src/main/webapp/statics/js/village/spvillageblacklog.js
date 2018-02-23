$(function () {
    $("#jqGrid").jqGrid({
        url: '../spvillageblacklog/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '小区表ID', name: 'villageId', index: 'village_id', width: 80 }, 			
			{ label: '申请人ID', name: 'applyUserId', index: 'apply_user_id', width: 80 }, 			
			{ label: '机构ID', name: 'orgId', index: 'org_id', width: 80 }, 			
			{ label: '拉黑或解除拉黑用户ID', name: 'blackUserId', index: 'black_user_id', width: 80 }, 			
			{ label: '原因', name: 'remark', index: 'remark', width: 80 }, 			
			{ label: '状态.1加入黑名单,0解除黑名单', name: 'state', index: 'state', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		spVillageBlackLog: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.spVillageBlackLog = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.spVillageBlackLog.id == null ? "../spvillageblacklog/save" : "../spvillageblacklog/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.spVillageBlackLog),
			    success: function(r){
			    	if(r.code === 0){
						alert(r, function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: "../spvillageblacklog/delete",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert(r, function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get("../spvillageblacklog/info/"+id, function(r){
                if(r.code == 0){
                    vm.spVillageBlackLog = r.spVillageBlackLog;
                }else{
                    alert(r.msg);
                }
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});