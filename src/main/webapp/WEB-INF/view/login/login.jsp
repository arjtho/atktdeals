<%--
  Created by IntelliJ IDEA.
  User: Mahadec
  Date: 11/6/13
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div style=";padding: 7px">

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
               <div>
                   <div class="login-label"> User Name / Email Id: </div>
               </div>
           </div>
           <div class="col-lg-6">
               <div>
                   <input class="login-fields" id="login-email-id" value=""  type="text">
               </div>
           </div>
       </div>
       <div class="row">
           <div class="col-lg-4">
               <div>
                   <div  class="login-label"> Password:</div>
               </div>
           </div>
           <div class="col-lg-6">
               <div>
                   <input id="login-password"  class="login-fields" type="password">
               </div>
           </div>
       </div>

       <div class="row">
           <div class="col-lg-4">
           </div>
           <div class="col-lg-6">
               <div class="login-label">
                   <a href="#"> Forgot Password</a>
               </div>
           </div>
       </div>

       <div class="row">
           <div class="col-lg-4">
           </div>
           <div class="col-lg-6">
               <div  class="login-label">
                   <input id="login-stay-logged" type="checkbox"> <label style="margin-left: 10px"> Keep me logged in</label></input>
               </div>
           </div>
       </div>
       <div class="row">
           <div class="col-lg-4">
           </div>
           <div class="col-lg-6">
               <div  class="login-label">
                   <a class="btn btn-primary search-button">
                       <span class="add-on">Login in</span>
                   </a>
               </div>
           </div>
       </div>
   </div>

    <div id="new-user"  style="display: none">
        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div class="login-label"> Enter your Name: </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div>
                    <input class="login-fields" id="login-your-name" value=""  type="text">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div class="login-label"> User Name / Email Id: </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div>
                    <input class="login-fields" id="login-email-id" value=""  type="text">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div  class="login-label"> Password:</div>
                </div>
            </div>
            <div class="col-lg-6">
                <div>
                    <input id="login-new-password"  class="login-fields" type="password">
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div  class="login-label"> Confirm Password:</div>
                </div>
            </div>
            <div class="col-lg-6">
                <div>
                    <input id="login--confirm-password"  class="login-fields" type="password">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-6">
                <div  class="login-label">
                    <a class="btn btn-primary search-button">
                        <span class="add-on">Create Account</span>
                    </a>
                </div>
            </div>
        </div>
   </div>

</div>