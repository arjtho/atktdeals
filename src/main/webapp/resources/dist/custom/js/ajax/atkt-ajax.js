/**
 * Ajax framework.
 * Created with IntelliJ IDEA.
 * User: Mahadev
 * Date: 11/6/13
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
(function(scope,$) {
    var AtKtAjax =(function(){

        var BASE_ELEMENT=  "body";
        var FAIL= "Fail";
        var SUCCESS= "Success";

        return {

            /**
             * This is the base element.
             * @returns {string}
             */
            getBaseElement: function() {
                  return BASE_ELEMENT;
            },

            /**
             * This function returns the callback function which will be called if the ajax request failed.
             * @param actionName
             * @returns fail callback function name
             */
            getFailEvent: function(actionName){
                var failEventName = null;
                if(actionName){
                    failEventName = actionName+FAIL;
                }
                return failEventName;
            },

            /**
             * This function returns the callback function which will be called if the ajax request failed.
             * @param actionName
             * @returns Success callback function name
             */
            getSuccessEvent: function(actionName){
                var successEventName = null;
                if(actionName){
                    successEventName = actionName+SUCCESS;
                }
                return successEventName;
            },
            /**
             * This function will be called when the ajax request is failed.
             * Custom event will be triggered on base element configured.
             * @param jqXHR
             * @param textStatus
             * @param actionName
             */
            onFail: function (jqXHR, textStatus, actionName) {
                if(actionName) {
                    $(BASE_ELEMENT).trigger(AtKtAjax.getFailEvent(actionName), [jqXHR, textStatus]);
                }
            },

            /**
             * This function will be called when the ajax request is completed successfully.
             * Custom event will be triggered on base element configured.
             * @param response
             * @param acitionName
             */
            onSuccess: function (response, actionName) {
                if(actionName) {
                    $(BASE_ELEMENT).trigger(AtKtAjax.getSuccessEvent(actionName), [response]);
                }
            },


            /**
             * Call this function to send the information to server and get the html response back.
             * @param actionName
             * @param url
             * @param dataToSend
             */
            makeServerCall: function (actionName, url, dataToSend) {

                var request = $.ajax({
                    url: url,
                    type: "POST",
                    data: dataToSend,
                    dataType: "html"
                });

                request.done(function (msg) {
                    AtKtAjax.onSuccess(msg, actionName)
                });

                request.fail(function (jqXHR, textStatus) {
                    AtKtAjax.onFail(jqXHR, textStatus, actionName)
                });
            },


            /**
             * Call this function to send the information to server and get the json response back.
             * @param actionName
             * @param url
             * @param dataToSend
             */
            makeServerCallToGetJson: function (actionName, url, dataToSend) {

                var request = $.ajax({
                    url: url,
                    type: "POST",
                    data: JSON.stringify(dataToSend),
                    dataType: "json",
                    contentType: "application/json"
                });

                request.done(function (msg) {
                    AtKtAjax.onSuccess(msg, actionName)
                });

                request.fail(function (jqXHR, textStatus) {
                    AtKtAjax.onFail(jqXHR, textStatus, actionName)
                });
            }
        }
    }());
    scope.AtKtAjaxNS = AtKtAjax;
}(window,jQuery));

