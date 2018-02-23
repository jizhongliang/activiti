$(function () {
    $('#datetimepicker1').datetimepicker({
        language:  'zh-CN',
        format: 'yyyy-MM-dd',
    });

    $('#datetimepicker2').datetimepicker({
        language:  'zh-CN',
        format: 'yyyy-MM-dd',
    });

    initEvent();

    ajaxCreditServiceType();
    
    ajaxServiceVariety();

    ajaxProvince();
})


var uploaders={};
var submitJson={};
var fileUploadState={};


//加载业务类型
function ajaxCreditServiceType() {
    $.ajax({
        type: "POST",
        url: '../sys/code/queryChildsByMark',
        data: JSON.stringify({
            mark:'credit_service_type'
        }),
        success: function(data){
            if(data.code == 0){
                finishAjax(data.data,"creditServiceType");
            }else{
                alert(data.msg);
            }
        }
    });
}


function ajaxServiceVariety() {
    $.ajax({
        type: "POST",
        url: '../sys/code/queryChildsByMark',
        data: JSON.stringify({
            mark:'service_variety'
        }),
        success: function(data){
            if(data.code == 0){
                finishAjax(data.data,"creditServiceVariety");
            }else{
                alert(data.msg);
            }
        }
    });
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

function ajaxCity(code) {
    $.ajax({
        type: "POST",
        url: '../sparea/list/queryByParentId',
        data: JSON.stringify({
            fatherCode:code
        }),
        success: function(data){
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


function finishAjax(data,id) {
    for(var i=0;i<data.length;i++){
        $("#"+id).append('<option value="'+data[i].value+'">'+data[i].name+'</option>');
    }
}


function changeProvince() {
    var provinceCode=$("#provinceSelect").val();
    ajaxCity(provinceCode);
}


function initEvent() {
    $("#addGuarantor").click(function(){
        var showLength=$(".list-bz-div:visible").length;
        if(showLength<5){
            $(".list-bz-div:hidden").eq(0).show();
        }else{
            alert("最大支持添加5个保证人");
        }
        hideFirstDelButton();
        resetLabel();
    })

    $(".delButton").click(function(){
        var parent=$(this).parent();
        parent.find("input[type='text']").val("");
        parent.hide();
        hideFirstDelButton();
        resetLabel();
    })


    initUploadButton();

    
   
    
    
    $("#saveBtn").click(function () {
        submitForm();
    })
}
$("#selectUserBtn").click(function () {
	        var url = "../credit/model";
	        var titile ="选择客户";
	        //弹框层
	        layer.open({
	            scrollbar: false,
	            type: 2,
	            title : [titile , true],
	            btn: ['确定','关闭'],
	            area: ['85%', '800px'], //宽高
	            content: [url,'no'],
	            shadeClose : true,
	            yes: function(index){
                    var res = window["layui-layer-iframe" + index].callbackdata();
                    var id=res.xuanze;
                    $.ajax({
            	        type: "POST",
            	        url: '../credit/xzkh',
            	        data:JSON.stringify({id:id}),
            	        success: function(data){
            	            if(data.code == 0){
            	            	if(data.map.user.name==""){	
            	            	}else{
            	            		$("#name").val(data.map.user.name);
            	            		$("#phone").val(data.map.user.phone);
            	            		$("#idNo").val(data.map.user.idNo);
            	            		$("#provinceSelect").val(data.map.spAreaEntity.areaName);
            	            		$("#citySelect").val(data.map.spAreaEntitys.areaName);
            	            		$("#vname").val(data.map.spVillageEntity.name);
            	            		var img=data.map.user.idNoPhoto;
            	            		var imgs=img.split(",");
            	            		var html="";
            	            		for(var i=0;i<imgs.length;i++){
            	            			html+='<img src="'+imgs[i]+'" style="width:200px; height:150px; ">';
            	            		}
            	            		$("#idImg").html(html);
            	            	}
            	            	layer.close(index);
            	            }else{
            	                alert(data.msg);
            	            }
            	        }
            	    });
                    
                },
                cancel: function(){
                	layer.close();
                }
	        });
})
$("#submitBtn").click(function(){
	 $.ajax({
	        type: "POST",
	        url: '../credit/queryxlz',
	        success: function(data){
	            if(data.code == 0){
	            	var myDate = new Date();
	            	var month=myDate.getMonth()+1;
	            	var year=myDate.getFullYear();
	                if(month<10){
	                	month="0"+month;
	                }
	            	var creditServiceType=$("#creditServiceType").val();
	            	if(creditServiceType==""){
	            		alertMsg("业务类型不能为空");
	            		return;
	            	}
	            	var creditServiceVariety=$("#creditServiceVariety").val();
	            	if(creditServiceVariety==""){
	            		alertMsg("业务品种不能为空");
	            		return;
	            	}
	               $("#hth").val(creditServiceType+data.map.zone+creditServiceVariety+year+month+data.map.xlz);  
	            }else{
	                alert(data.msg);
	            }
	        }
	    });
	
});

function hideFirstDelButton() {
    $(".list-bz-div:visible").find(".delButton").show();
    $(".list-bz-div:visible").eq(0).find(".delButton").hide();
}

function resetLabel() {
    $(".list-bz-div:visible").each(function(index){
        $(this).find(".list-bz-label").find("div").eq(0).text("保证人"+(index+1));
    })
}


function initUploadButton() {
    $(".upload-img").each(function () {
        var id=$(this).attr("id");
        if(id){
            uploaders[id]=initUploader(id);
        }
    })
}


function initUploader(btn) {
    var uploader = new plupload.Uploader({
        runtimes: 'html5,flash,silverlight,html4',
        browse_button: btn,
        multi_selection: true,
        flash_swf_url: '../../plib/plugins/pupload-2.1.2/js/Moxie.swf',
        silverlight_xap_url: '../../plib/plugins/plupload-2.1.2/js/Moxie.xap',
        url: '../sys/oss/uploadFile',
        filters: {
            mime_types: [{ //只允许上传图片
                title: "Image files",
                extensions: "jpg,jpeg,png,pdf,xls,.xlsx,doc,docx"
            }],
            max_file_size: '10mb', //最大只能上传10mb的文件
            prevent_duplicates: true //不允许选取重复文件
        },

        init: {
            FilesAdded: function(up, files) {
                for(var i=0;i<files.length;i++){
                    previewImage(files[i],btn);
                }
            },
            BeforeUpload: function(up, file) {

            },
            UploadProgress: function(up, file) {

            },
            FileUploaded: function(up, file, info) {
                if(info.status == 200) {
                    fileUploadfinish(btn,info,file);
                } else {
                    alert("文件上传失败");
                }
            },
            Error: function(up, err) {
                if(err.code == -600) {
                    error("选择的文件太大了");
                } else if(err.code == -601) {
                    error("不支持上传文件类型");
                } else if(err.code == -602) {
                    error("这个文件已经上传");
                } else {

                }
            }
        }
    });
    uploader.init();
    return uploader;
}

function previewImage(file,btn) {
    //确保文件是图片
    if(!file) return;
    if(/image\//.test(file.type)){
        var preloader = new mOxie.Image();
        preloader.onload = function() {
            //preloader.downsize(550, 400);//先压缩一下要预览的图片,宽300，高300
            var imgsrc = preloader.type == 'image/jpeg' ? preloader.getAsDataURL('image/jpeg', 80) : preloader.getAsDataURL(); //得到图片src,实质为一个base64编码的数据
            initImage(imgsrc,file,btn); //callback传入的参数为预览图片的url
            preloader.destroy();
            preloader = null;
        };
        preloader.load(file.getSource());
    }
}


function initImage(imgsrc,file,btn) {
    $("#"+btn).parent().append('<div  class="upload-img-list"><div class="image_div"><div class="image"><img src="'+imgsrc+'" width="175px"/></div></div>' +
        '<div class="image-handle"><span style="cursor: pointer;"><i class="layui-icon">&#xe640;</i></span></div></div>');
    $("#"+btn).parent().find(".layui-icon:last").on("click",function () {
        $(this).parents(".upload-img-list").remove();
        uploaders[btn].removeFile(file);
    })
}

function fileUploadfinish(btn,info,file) {
    var data=JSON.parse(info.response);
    if(data.code=="0"){
        if(btn.indexOf("idenImg")!=-1){
            var index=btn.replace("idenImg","");
            var bonds=submitJson.bonds;
            if(!bonds){
                bonds=[];
                for(var i=0;i<5;i++){
                    bonds.push({
                        id:"idenImg"+i,
                        images:[]
                    })
                }
            }
            submitJson.bonds=bonds;
            submitJson.bonds[index].images.push(data.url);
        }else{
            var fileArray=submitJson[btn];
            if(!fileArray){
                fileArray=[];
            }
            fileArray.push(data.url);
            submitJson[btn]=fileArray;
        }
        fileUploadState[file.id]=true;
    }
    console.log(fileUploadState);
    for(var key in fileUploadState){
        if(!fileUploadState[key]){
            return;
        }
    }

    //进行提交
    console.log(submitJson);
}

function submitForm() {
    for(var key in uploaders){
        if(uploaders[key].files.length>0){
            //设置文件上传状态为未上传
            var files=uploaders[key].files;
            for(var i=0;i<files.length;i++){
                fileUploadState[files[i].id]=false;
            }
            uploaders[key].start();
        }
    }

}