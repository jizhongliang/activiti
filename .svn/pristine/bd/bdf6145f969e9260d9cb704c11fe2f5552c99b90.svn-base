$(function () {
    $("#jqGrid").jqGrid({
        url: '../spcontract/list',
        datatype: "json",
        colModel: [
			{ label: '合同号', name: 'contractNum', index: 'contract_num', width: 80 }, 			
			{ label: '申请人身份证号', name: 'idNo', index: 'id_no', width: 80 }, 			
			{ label: '申请人姓名', name: 'idName', index: 'id_name', width: 80 }, 			
			{ label: '流程名', name: 'instanceName', index: 'instance_name', width: 80 }, 			
			{ label: '申请额度', name: 'credit', index: 'credit', width: 80 }, 			
			{ label: '合同状态(流程状态)', name: 'contractState', index: 'contract_state', width: 80 }, 			
			{ label: '客户经理', name: 'adderName', index: 'adder_name', width: 80 }, 			
			{ label: '合同生效时间', name: 'contractStartTime', index: 'contract_start_time', width: 80 }, 			
			{ label: '合同失效时间', name: 'contractEndTime', index: 'contract_end_time', width: 80 }, 			
			{ label: '额度id', name: 'creditId', index: 'credit_id', width: 80 },
            { label: '操作', name: 'handle',  formatter: function(value, options, row){
                    return '<button class="layui-btn layui-btn-small" id="showBtn">查看合同</button>' +
                        '<button class="layui-btn layui-btn-small" id="detailBtn">申请详情</button>' +
                        '<button class="layui-btn layui-btn-small" id="moveBtn">移交清单</button>'
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
            contractNum: null,
            instanceName:null,
            idNo:null
        },
		showList: true,
		title: null,
		spContract: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.spContract = {};
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
			var url = vm.spContract.id == null ? "../spcontract/save" : "../spcontract/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.spContract),
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
				    url: "../spcontract/delete",
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
			$.get("../spcontract/info/"+id, function(r){
                if(r.code == 0){
                    vm.spContract = r.spContract;
                }else{
                    alert(r.msg);
                }
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{
                postData:{'contractNum': vm.q.contractNum,
                  		  'instanceName': vm.q.instanceName,
						  'idNo': vm.q.idNo,
						  'contractStartTime':$("#dataInput").val(),
						'contractEndTime':$("#dataInput1").val()
				},
                page:page
            }).trigger("reloadGrid");
		}
	}
});