$(function () {
    $("#jqGrid").jqGrid({
        url: '../apilog/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '应用类型', name: 'aid', index: 'aid', width: 80 },
			{ label: '服务平台类型', name: 'env', index: 'env', width: 80 },
			{ label: '客户端类型', name: 'client', index: 'client', width: 80 },
			{ label: '已登录用户全局id', name: 'uid', index: 'uid', width: 80 }, 			
			{ label: '客户端的唯一标示', name: 'mac', index: 'mac', width: 80 },
			{ label: '方法名', name: 'methodName', index: 'method_name', width: 80 },
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 },
			{ label: '请求参数', name: 'reqParam', index: 'req_param', width: 80 },
			{ label: '返回结果', name: 'resData', index: 'res_data', width: 80 },
			{ label: '请求结果返回码', name: 'resCode', index: 'res_code', width: 80 }, 			
			{ label: '请求时间戳', name: 'reqTime', index: 'req_time', width: 80 }, 			
			{ label: '响应时间戳', name: 'resTime', index: 'res_time', width: 80 }, 			
			{ label: '客户端版本号', name: 'clientVersion', index: 'client_version', width: 80 }, 			
			{ label: '描述', name: 'description', index: 'description', width: 80 }
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
		apiLog: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.apiLog = {};
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
			var url = vm.apiLog.id == null ? "../apilog/save" : "../apilog/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.apiLog),
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
				    url: "../apilog/delete",
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
			$.get("../apilog/info/"+id, function(r){
                if(r.code == 0){
                    vm.apiLog = r.apiLog;
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