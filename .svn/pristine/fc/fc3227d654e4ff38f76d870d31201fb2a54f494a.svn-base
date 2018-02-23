<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>选择客户</title>
	    <%@include file="/common/commonCSS.jsp" %>
	    <%@include file="/common/commonJS.jsp" %>
		<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
		
	</head>
	<body>
		<div id="main-container">
		 <div class="row" style="margin-top: 20px;">
            <div class="col-md-12">
             <form class="layui-form" id="search-from" action="../credit/model">
                    <div class="layui-form-item">
                        <label class="layui-form-label" style="width:6%;">小区名称:</label>
                          <div class="layui-input-inline">
                            <input  class="form-control" name="villageId" id="villageId" v-model="user.villageId" />
                        </div>
                        <label class="layui-form-label" style="width:6%;">姓名:</label>
                        <div class="layui-input-inline">
                            <input  class="form-control" name="name" id="name" v-model="user.name" />
                        </div>
                        <label class="layui-form-label" style="width:6%;">身份证号:</label>
                        <div class="layui-input-inline">
                            <input  class="form-control" name="idNo" id="idNo" v-model="user.idNo" />
                        </div>
                        <label class="layui-form-label" style="width:6%;">手机号:</label>
                        <div class="layui-input-inline">
                            <input  class="form-control" name="phone" id="phone" v-model="user.phone" />
                        </div>
                        <button class="layui-btn" id="searchSubmit"><i class="layui-icon">&#xe615;</i>搜 索</button>
                        <button class="layui-btn layui-btn-warm" type="button" id="refresh">重 置</button> 
                    </div>
                    </form>
            </div>
        </div>
		
			<div class="row">
            <div class="col-sm-12">
                <table id="table-list" class="layui-table">
                    <thead>
                        <tr>
                            <th>序号</th>
                            <th></th>
                            <th>小区名称</th>
                            <th>姓名</th>
                            <th>身份证号</th>
                            <th>性别</th>
                            <th>年龄</th>
                            <th>手机号</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${page.result}" var="a" varStatus="i">
                            <tr id="article_${a.id }">
                                <td>${i.index+1 }</td>
                                <td><input type="radio" name="radio" value="${a.id}" > </td>
                                <td>${a.education}</td>
                                <td>${a.name}</td>
                                <td>${a.idNo}</td>
                                <td>${a.sex}</td>
                                <td>${a.age}</td>
                                <td>${a.phone}</td>
                            </tr>
                        </c:forEach> 
                    </tbody>
                </table>
                <sys:page page="${page}"></sys:page>
            </div>
        </div>
		</div>
	</body>
	
	<script type="text/javascript">
 	
        var callbackdata = function () {
            var data = {
            	xuanze:$("input[type='radio']:checked").val()
            };
            return data;
        }
    </script>
</html>