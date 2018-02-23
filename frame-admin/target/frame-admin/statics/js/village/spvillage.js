$(function () {
    $("#jqGrid").jqGrid({
        url: '../spvillage/list',
        datatype: "json",
        colModel: [			
			{ label: '项目编号', name: 'id', index: 'id', width: 50, key: true },
			{ label: '楼盘名称', name: 'name', index: 'name', width: 80 },
            { label: '项目位置', name: 'location', index: 'location', width: 80 },
            { label: '是否有证', name: 'isCredentials', index: 'is_credentials', width: 80 },
            { label: '当前状态', name: 'status', index: 'status', width: 80 },
            { label: '申请时间', name: 'startTime', index: 'start_time', width: 80 },
            { label: '操作', name: 'handle',  formatter: function(value, options, row){
                    return '<button class="layui-btn layui-btn-small" id="editBtn">详细</button>' +
                        '<button class="layui-btn layui-btn-small" id="historyBtn">查看处理记录</button>';
                }}
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
        	//$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
        }
    });
    ajaxProvince();
    ajaxProvince1();
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
        spVillage:{},
        q:{
            name:null,
            area:null,
            city:null,
            county:null,
            orgId:null,
            startUserId:null,
            isCredentials:null,
            type:null
        }
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.spVillage = {};
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
			var url = vm.spVillage.id == null ? "../spvillage/save" : "../spvillage/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.spVillage),
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
				    url: "../spvillage/delete",
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
			$.get("../spvillage/info/"+id, function(r){
                if(r.code == 0){
                    vm.spVillage = r.spVillage;
                  /*  ajaxProvince();
                    ajaxCity(vm.spVillage.area);
                    ajaxCounty(vm.spVillage.city);*/
                }else{
                    alert(r.msg);
                }
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{
                postData:{
                    'name': vm.q.name,
                    'area': vm.q.area,
                    'city': vm.q.city,
                    'county': vm.q.county,
                    'orgId': vm.q.orgId,
                    'startUserId': vm.q.startUserId,
                    'isCredentials': vm.q.isCredentials,
                    'type': vm.q.type
				},
                page:page
            }).trigger("reloadGrid");
		}
	}
});



function readFile(){
    var fd = new FormData();
    for(var i=0;i<this.files.length;i++){
        var reader = new FileReader();
        reader.readAsDataURL(this.files[i]);
        fd.append(i,this.files[i]);
    }
    $.ajax({
        url : '',
        type : 'post',
        data : fd,
        success : function(data){
            console.log(data)
        }
    })
}

function changeProvince() {
    var provinceCode=$("#provinceSelect").val();
    ajaxCity(provinceCode);
}
function ajaxCity(code) {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:code
        }),
        success: function(data){
            console.log(data.code)
            if(data.code == 0){
                finishAddress(data.data,'citySelect');
            }else{
                alert(data.msg);
            }
        }
    });
}

function finishAddress(data,id){
    var defaultOption=$("#"+id).find("option").eq(0);
    $("#"+id).empty();
    $("#"+id).append(defaultOption);
    for(var i=0;i<data.length;i++){
        $("#"+id).append('<option value="'+data[i].areaCode+'">'+data[i].areaName+'</option>');
    }
}


function ajaxProvince() {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:'000000'
        }),
        success: function(data){
            if(data.code == 0){
                finishAddress(data.data,'provinceSelect');
            }else{
                alert(data.msg);
            }
        }
    });
}

function ajaxProvince1() {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:'000000'
        }),
        success: function(data){
            if(data.code == 0){
                finishAddress(data.data,'provinceSelect1');
            }else{
                alert(data.msg);
            }
        }
    });
}

function changeCity() {
    var provinceCode=$("#citySelect").val();
    ajaxCounty(provinceCode);
}
function ajaxCounty(code) {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:code
        }),
        success: function(data){
            if(data.code == 0){
                finishAddress(data.data,'countySelect');
            }else{
                alert(data.msg);
            }
        }
    });
}


function changeProvince1() {
    var provinceCode=$("#provinceSelect1").val();
    ajaxCity1(provinceCode);
}
function ajaxCity1(code) {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:code
        }),
        success: function(data){
            console.log(data.code)
            if(data.code == 0){
                finishAddress(data.data,'citySelect1');
            }else{
                alert(data.msg);
            }
        }
    });
}


function changeCity1() {
    var provinceCode=$("#citySelect1").val();
    ajaxCounty1(provinceCode);
}
function ajaxCounty1(code) {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:code
        }),
        success: function(data){
            if(data.code == 0){
                finishAddress(data.data,'countySelect1');
            }else{
                alert(data.msg);
            }
        }
    });
}