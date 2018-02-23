$(function () {
    $("#jqGrid").jqGrid({
        url: '../spbond/list',
        datatype: "json",
        colModel: [
			{ label: '客户名称', name: 'name', index: 'name', width: 80 },
			{ label: '客户性别', name: 'sex', index: 'sex', width: 80 },
			{ label: '手机号码', name: 'phone', index: 'phone', width: 80 },
			{ label: '登记日期', name: 'checkDate', index: 'check_date', width: 80 },
			{ label: '客户来源', name: 'source', index: 'source', width: 80 },
			{ label: '更新日期', name: 'updateDate', index: 'update_date', width: 80 },
			{ label: '更新人', name: 'updateUser', index: 'update_user', width: 80 },
			{ label: '工作单位', name: 'company', index: 'company', width: 80 },
			{ label: '家庭住址', name: 'postalAddress', index: 'postal_address', width: 80 },
			{ label: '单位所属行业', name: 'tradeType', index: 'trade_type', width: 80 },
            { label: '所属客户经理', name: 'sysUser', index: 'sys_user', width: 80 },
            { label: '客户所属机构', name: 'organ', index: 'organ', width: 80 },
            { label: '客户状态', name: 'state', index: 'state', width: 80 },
            { label: '是否警示类客户', name: 'cautionState', index: 'caution_state', width: 80 },
            { label: '所属小区', name: 'village', index: 'village', width: 80 },
			{ label: '操作', name: 'handle',  formatter: function(value, options, row){
                    '<button class="layui-btn layui-btn-small" id="editBtn">查看</button>'+
                        '<button class="layui-btn layui-btn-small" id="editBtn">编辑</button>'+
                        '<button class="layui-btn layui-btn-small" id="editBtn">更新记录</button>'+
                        '<button class="layui-btn layui-btn-small" id="editBtn">删除(假删)</button>'+
                        '<button class="layui-btn layui-btn-small" id="editBtn">加入(解除)黑名单</button>'
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
		basic:{
            userName:null,
            idType:null,
			phoneName:null,
            brithDay:null,
            expiry:null,
			age:null,
			sex:null,
            maritalStatus:null,


		},
		showList: true,
		title: null,
		spBond: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.spBond = {};
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
			var url = vm.spBond.id == null ? "../spbond/save" : "../spbond/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.spBond),
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
				    url: "../spbond/delete",
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
			$.get("../spbond/info/"+id, function(r){
                if(r.code == 0){
                    vm.spBond = r.spBond;
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