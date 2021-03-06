/**
 * Created with IntelliJ IDEA.
 * User: Mahadev
 * Date: 11/8/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
(function (scope, $) {
    var AtKtVanillaModel = (function () {
        var vanilaDivId = "#vanilla-modal";

        var vanillaModalContents = "#vanilla-modal-contents";
        var vanillaBody = "#vanilla-modal-body";
        var vanillaModalTitle = "#vanilla-modal-title";
        var defaultHeight = 400;
        var defaultWidth = 400;
        return {
            init: function () {
                $("#vanilla-modal").modal({ keyboard: false,show: false });
            },

            setBodySize:function(height, width){
                var dialogHeight = defaultHeight;
                var dialogWidth = defaultWidth;
                if(height) {
                     dialogHeight =  height;
                }
                if(width) {
                    dialogWidth = width;
                }
              //  AtKtVanillaModel.setHeight(dialogHeight);
               // AtKtVanillaModel.setWidth(dialogWidth);
            },

            setHeight: function(height) {
                $(vanillaModalContents).height(height + "px");
                var bodyHeight = (height -50) + "px";
                $(vanillaBody).css({height:bodyHeight});
            },
            setWidth: function(width) {
                $(vanillaModalContents).width(width+ "px");
            },

            setTitle: function(title) {
                $(vanillaModalTitle).text(title);
            },

            setModalBodyContents: function(contentsToReplace){
                $(vanillaBody).html(contentsToReplace);
            },

            showModal: function(height, width, contents, title, url){
                AtKtVanillaModel.setBodySize(height, width);
                AtKtVanillaModel.setModalBodyContents(contents);
                AtKtVanillaModel.setTitle(title);
                $(vanilaDivId).modal('show');
            },

            hideModal : function() {
                $(vanilaDivId).modal('hide');
            }
        }
    }());
    scope.AtKtVanillaModelNS = AtKtVanillaModel;
}(window, jQuery));