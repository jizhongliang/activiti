$(function () {
    $("#jqGrid").jqGrid({
        url: '../spguaranty/list',
        datatype: "json",
        colModel: [
			{ label: '客户名称', name: 'userName', index: 'user_name', width: 80 }, 			
			{ label: '额度信息id', name: 'creditId', index: 'credit_id', width: 80 }, 			
			{ label: '车位地址', name: 'parkAddress', index: 'park_address', width: 80 }, 			
			{ label: '车位面积', name: 'parkArea', index: 'park_area', width: 80 }, 			
			{ label: '担保物类型', name: 'guarantyType', index: 'guaranty_type', width: 80 }, 			
			{ label: '评估价', name: 'price', index: 'price', width: 80 }, 			
			{ label: '公允价', name: 'gprice', index: 'gprice', width: 80 }, 			
			{ label: '车位号', name: 'parkNo', index: 'park_no', width: 80 }, 			
			{ label: '他项权证号', name: 'hisPowerNo', index: 'his_power_no', width: 80 }, 			
			{ label: '新增人', name: 'addName', index: 'add_name', width: 80 }, 			
			{ label: '新增部门', name: 'addDepart', index: 'add_depart', width: 80 }, 			
			{ label: '修改人', name: 'updateName', index: 'update_name', width: 80 }, 			
			{ label: '担保物状态:0:失效,1:正常', name: 'state', index: 'state', width: 80 }, 			
			{ label: '添加时间', name: 'addTime', index: 'add_time', width: 80 }, 			
			{ label: '修改时间', name: 'updateTime', index: 'update_time', width: 80 },
            { label: '操作', name: 'handle',  formatter: function(value, options, row){
                    '<button class="layui-btn layui-btn-small" id="detailBtn">申请详情</button>'
                }}
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: false,
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
		q:{

		},
		showList: true,
		title: null,
		spGuaranty: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.spGuaranty = {};
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
			var url = vm.spGuaranty.id == null ? "../spguaranty/save" : "../spguaranty/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.spGuaranty),
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
				    url: "../spguaranty/delete",
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
			$.get("../spguaranty/info/"+id, function(r){
                if(r.code == 0){
                    vm.spGuaranty = r.spGuaranty;
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