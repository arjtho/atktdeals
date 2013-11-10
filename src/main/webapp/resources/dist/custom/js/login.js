/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/6/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
(function (scope, $) {
    var AtKtLogin = (function () {
        var loginAction = "loginAction";
        var loginPageUrl = "getLogin";
        return {
            init: function () {
                $("#login-my-account").on("click", AtKtLogin.getLogin);
            },

            getLogin: function () {
                $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getSuccessEvent(loginAction), AtKtLogin.displayLoginPage);
                $(AtKtAjaxNS.getBaseElement()).on(AtKtAjaxNS.getFailEvent(loginAction), AtKtLogin.displayLoginPage);
                AtKtAjaxNS.makeServerCall(loginAction, loginPageUrl, null)
            },

            displayLoginPage: function (event, response) {
                AtKtVanillaModelNS.showModal(400,400, response, "User Login");
                $("[name=login-user-type]").on("change", AtKtLogin.handleUserTypeChange);
            },

            handleUserTypeChange: function(event) {
                 if($(this).val() == "1") {
                     $("#new-user").hide();
                     $("#existing-user").show();
                 } else {
                     $("#existing-user").hide();
                     $("#new-user").show();
                 }
            }
        }
    }());
    scope.AtKtLoginNS = AtKtLogin;
}(window, jQuery));