(function(scope,$) {
    var appNavToolbar = (function(){

        return {

            /**
             * This is init function.
             */
            init: function(){
                appNavToolbar.registerAppNavToolbar();
                AtKtVanillaModelNS.init();
                AtKtLoginNS.init();
                $(document).on("pillClick", appNavToolbar.handlePillSelected);
            },

            /**
             * This function registers the App nav pills click event.
             */
            registerAppNavToolbar: function () {
                $("#app-nav-toolbar ul li").on("click", function () {
                    appNavToolbar.selectClickedPill(this);
                    appNavToolbar.firePillSelectEvent(this);

                });
            },

            /**
             * This function is to change the pills background color based on user click event.
             */
            selectClickedPill : function (clickedPill) {
                $("#app-nav-toolbar ul li").removeClass("app-nav-menu-active").addClass("app-nav-menu-inactive");
                $(clickedPill).removeClass("app-nav-menu-inactive");
                $(clickedPill).addClass("app-nav-menu-active");
            },

            /**
             * Fire Pills selected event so that listener can handle it.
             * @param sourceElement
             */
            firePillSelectEvent : function (sourceElement){
                sourceElement = $(sourceElement);
                $.event.trigger({
                    type: "pillClick",
                    message: "Pill Clicked",
                    sourceElement : sourceElement,
                    time: new Date()
                });
            },

            /**
             * Pills event handler.
             * @param sourceEvent
             */
            handlePillSelected : function(sourceEvent) {
                 //alert(sourceEvent.sourceElement.attr('id'))
            }
        }
    }());
    scope.AppNavToolbarSN = appNavToolbar;
}(window,jQuery));