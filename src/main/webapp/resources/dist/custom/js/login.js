/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/6/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
(function (scope, $) {
    var AtKtLogin = (function () {

        var SUCCESS = "SUCCESS";
        var FAIL = "FAIL";

        var loginAction = "loginAction";
        var loginPageUrl = "getLogin";

        var newUserAction = "newUserAction";
        var newUserDoLoginUrl = "user/createUser";

        var doLoginAction = "doLogin";
        var doLoginUrl = "login/doLogin";


        return {
            init: function () {
                $("#login-my-account").on("click", AtKtLogin.getLogin);
            },

            getLogin: function () {
                $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getSuccessEvent(loginAction), AtKtLogin.displayLoginPage);
                $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getFailEvent(loginAction), AtKtLogin.displayLoginPage);
                AtKtAjaxNS.makeServerCall(loginAction, loginPageUrl, null)
            },

            createNewAccount: function () {
                var errorFields = AtKtLogin.validateNewUser();
                if(errorFields.length > 0) {
                    AtKtValidatorNS.indicateErrorFields(errorFields);
                } else {
                    $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getSuccessEvent(newUserAction), AtKtLogin.newUserSuccess);
                    $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getFailEvent(newUserAction), AtKtLogin.newUserSuccess);
                    AtKtAjaxNS.makeServerCallToGetJson(newUserAction, newUserDoLoginUrl, AtKtLogin.getNewUserParams());
                }
            },

            newUserSuccess : function(event, user) {
               if(user.userStatus == "SUCCESS") {
                   alert("Success");
               }

            },

            loginSuccess : function(event, user) {
                if(user.userStatus == "SUCCESS") {
                    AtKtVanillaModelNS.hideModal();
                    $("#user-welcome-name").text(user.firstName);
                    $("#user-welcome-box").show();
                } else {
                  $("#login-error-message-box").show();
                  var fieldPrefix= "#login-";
                  AtKtValidatorNS.indicateErrorFields(user.errorFields, fieldPrefix);
                }
            },

            doLogin: function() {
                var errorFields = AtKtLogin.validateLogin();
                if(errorFields.length > 0) {
                   AtKtValidatorNS.indicateErrorFields(errorFields);
                } else {
                    $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getSuccessEvent(doLoginAction), AtKtLogin.loginSuccess);
                    $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getFailEvent(newUserAction), AtKtLogin.loginSuccess);
                    AtKtAjaxNS.makeServerCallToGetJson(doLoginAction, doLoginUrl, AtKtLogin.getLoginParams())
                }
            },

            getLoginParams:function() {
                var userId = $("#login-email").val();
                var password = $("#login-password").val();
                return {
                    email: userId,
                    password: password
                }
            },

            getNewUserParams: function() {
                var firstName = $("#new-user-firstName").val();
                var lastName = $("#new-user-lastName").val();
                var email = $("#new-user-email").val();
                var password = $("#new-user-password").val();
                return {
                    firstName: firstName,
                    lastName: lastName,
                    email: email,
                    password: password
                }
            },

            /**
             *
             * @param event
             * @param response
             */
            displayLoginPage: function (event, response) {
                AtKtVanillaModelNS.showModal(350,505, response, "User Login");
                $("[name=login-user-type]").on("change", AtKtLogin.handleUserTypeChange);
                $("#new-user-login-btn").on("click", AtKtLogin.createNewAccount);
                $("#user-login").on("click", AtKtLogin.doLogin);
            },
            /**
             *
             * @param event
             */
            handleUserTypeChange: function(event) {
                 if($(this).val() == "1") {
                     $("#new-user").hide();
                     $("#login-error-message-box").hide();
                     $("#existing-user").show();
                 } else {
                     $("#login-error-message-box").hide();
                     $("#existing-user").hide();
                     $("#new-user").show();
                 }
            },

            /**
             *
             */
            validateNewUser: function(){


            },

            /**
             *
             * @returns {boolean}
             */
            validateLogin: function(){
                var fieldPrefix= "#login-";
                var errorFields = [];

                var email = $(fieldPrefix + "email");
                var password = $(fieldPrefix + "password");

                if(!AtKtValidatorNS.isValidEmail(email)) {
                    errorFields.push(email);
                }

                if(!AtKtValidatorNS.isValidLength(password, 6)) {
                    errorFields.push(password);
                }

                return errorFields;
            },

            /**
             *
             * @returns {boolean}
             */
            validateNewUser: function(){
                var fieldPrefix= "#new-user-";
                var errorFields = [];

                var firstName = $(fieldPrefix + "firstName");
                var lastName = $(fieldPrefix + "lastName");
                var email = $(fieldPrefix + "email");
                var password = $(fieldPrefix + "password");
                var confirmPassword = $(fieldPrefix + "confirm-password");


                if(!AtKtValidatorNS.isValidLength(firstName, 2)) {
                    errorFields.push(firstName);
                }

                if(!AtKtValidatorNS.isValidLength(lastName, 2)) {
                    errorFields.push(lastName);
                }

                if(!AtKtValidatorNS.isValidEmail(email)) {
                    errorFields.push(email);
                }

                if(!AtKtValidatorNS.isValidLength(password, 6)) {
                    errorFields.push(password);
                }

                if(!AtKtValidatorNS.isValidLength(confirmPassword, 6)) {
                    errorFields.push(confirmPassword);
                }

                return errorFields;
            }
        }
    }());
    scope.AtKtLoginNS = AtKtLogin;
}(window, jQuery));