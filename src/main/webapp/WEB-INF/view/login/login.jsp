<%--
  Created by IntelliJ IDEA.
  User: Mahadec
  Date: 11/6/13
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="login-error-message-box" style="height: 50px;display: table;display: none">
    <div class="error-message-box">
        <i class="fa fa-exclamation-circle" style="color: red;font-size: 30px"></i>
    </div>
    <div class="error-message-box login-fields">
        <span style="margin-left: 12px"> Below highlighted fields are invalid. Please correct it. </span>
    </div>
</div>

<div style="padding: 7px">
    <div class="row" style="margin-bottom: 24px">
        <div class="col-lg-4">
            <div>
                <input type="radio" name="login-user-type" checked value="1"><lable class="login-label-header"> Existing User</lable> </input>
            </div>
        </div>
        <div class="col-lg-6">
            <div>
                <input type="radio" name="login-user-type" value="2"><lable class="login-label-header"> Create a new account</lable> </input>
            </div>
        </div>
    </div>

   <div id="existing-user">
       <div class="row">
           <div class="col-lg-4">
               <div class="login-label">
                   <div class="login-label-inner">
                       <spring:message code="login.user.name"/>
                   </div>
               </div>
           </div>
           <div class="col-lg-6">
               <div class="input-group margin-bottom-sm login-fields">
                   <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
                   <input id="login-email" class="form-control login-fields" type="text" placeholder='<spring:message code="login.user.name.placeholder"/>'>
               </div>
           </div>
       </div>
       <div class="row">
           <div class="col-lg-4">
               <div class="login-label">
                   <div class="login-label-inner"><spring:message code="login.user.password"/></div>
               </div>
           </div>
           <div class="col-lg-6">
               <div class="input-group">
                   <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                   <input id="login-password" class="form-control login-fields" type="password" placeholder='<spring:message code="login.user.password"/>'>
               </div>
           </div>
       </div>

       <div class="row">
           <div class="col-lg-4">
           </div>
           <div class="col-lg-6">
               <div class="login-label">
                   <a href="#"> <spring:message code="login.user.forgot.password"/></a>
               </div>
           </div>
       </div>

       <div class="row">
           <div class="col-lg-4">
           </div>
           <div class="col-lg-6">
               <div>
                   <a class="btn btn-primary app-buttons" id="user-login">
                       <span class="add-on"><spring:message code="login.user.login"/></span>
                   </a>
               </div>
           </div>
       </div>
   </div>

    <div id="new-user"  style="display: none">
        <div class="row">
            <div class="col-lg-2">
                <div class="login-label">
                    <div class="login-label-inner"><spring:message code="login.create.user.first.name"/></div>
                </div>
            </div>
            <div class="col-lg-5">
                <div class="input-group margin-bottom-sm login-fields">
                    <span class="input-group-addon"><i class="fa fa-user fa-fw"></i></span>
                    <input id="new-user-firstName" class="form-control login-fields" type="text" placeholder='<spring:message code="login.create.user.first.name"/>'>
                </div>
            </div>
            <div class="col-lg-5">
                <div class="input-group margin-bottom-sm login-fields">
                    <span class="input-group-addon"><i class="fa fa-users fa-fw"></i></span>
                    <input id="new-user-lastName"  class="form-control login-fields" type="text" placeholder='<spring:message code="login.create.user.last.name"/>'>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-2">
                <div class="login-label">
                    <div class="login-label-inner"><spring:message code="login.create.user.email"/> </div>
                </div>
            </div>
            <div class="col-lg-10">
                <div>
                    <div class="input-group margin-bottom-sm login-fields">
                        <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
                        <input id="new-user-email"  class="form-control login-fields" type="text" placeholder='<spring:message code="login.create.user.email"/>'>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-2">
                <div class="login-label">
                    <div class="login-label-inner"> <spring:message code="login.create.user.password"/></div>
                </div>
            </div>
            <div class="col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                    <input id="new-user-password" class="form-control login-fields" type="password" placeholder='<spring:message code="login.create.user.password"/>'>
                </div>
            </div>
            <div class="col-lg-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                    <input id="new-user-confirm-password" class="form-control login-fields" type="password" placeholder='<spring:message code="login.create.user.confirm.password"/>'>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-6">
                <div>
                    <a class="btn btn-primary app-buttons" id="new-user-login-btn">
                        <span class="add-on"><spring:message code="login.create.user.create.account"/></span>
                    </a>
                </div>
            </div>
        </div>
   </div>

</div>