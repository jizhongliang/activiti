$(function () {
    $("#jqGrid").jqGrid({
        url: '../credit/list/pending',
        datatype: "json",
        colModel: [
            { label: '订单号', name: 'contractNum', width: 100 },
            { label: '真实姓名', name: 'realName', width: 80 },
            { label: '手机号码', name: 'phone', width: 100 },
            { label: '项目名称', name: 'villageName', width: 150 },
            { label: '发起人', name: 'addUserName', width: 90 },
            { label: '接收类型', name: 'status', width: 100 },
            { label: '接收时间', name: 'addDate', index: "addDate", width: 150},
            { label: '操作', name: 'handle',  formatter: function(value, options, row){
                return '<button class="layui-btn layui-btn-small" id="editBtn">审批</button>' +
                    '<button class="layui-btn layui-btn-small" id="historyBtn">查看处理记录</button>' +
                    '<button class="layui-btn layui-btn-small" id="downBtn">下载附件</button>'
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
})