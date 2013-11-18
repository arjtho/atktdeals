<%--
  Created by IntelliJ IDEA.
  User: Mahadev Mane
  Date: 10/11/13
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="app-header-bg-color" id="first-header-panel">
    <div class="container">
        <div class="navbar  navbar-default app-navbar-override" id="header-bar">
            <div class="navbar-container" id="header-bar-container">
                <div class="navbar-header  pull-left">
                    <a href="#" class="navbar-brand">
                        <h1>
                            AtKtDeals
                        </h1>

                    </a>
                </div>
                <div class="navbar-header pull-right header-action-nav">
                   <div class="pull-left">
                       <ul class="nav navbar-nav">
                           <li>
                               <a class="header-action-nav-a" href="#" id="login-my-account">
                                   <span class="header-action-nav-divider">My Account</span>
                               </a>
                           </li>
                           <li>
                               <a class="header-action-nav-a" href="#">
                                   <span>Support</span>
                               </a>
                           </li>
                       </ul>
                   </div>
                    <div id="user-welcome-box" class="pull-right" style="display: none">
                        <div class="btn-group open">
                            <a class="btn btn-primary welcome-user-style" href="#"><i class="fa fa-user fa-fw"></i> Welcome <span id="user-welcome-name">Arjun</span></a>
                            <a class="btn btn-primary dropdown-toggle welcome-user-style" data-toggle="dropdown" href="#">
                                <span class="fa fa-caret-down"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="fa fa-power-off"></i> Logout</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!--header-bar-container -->

        </div>
    </div>

    <div class="app-header-bg-color">
        <div class="container app-menu-bar-empty">
        </div>
    </div>
    <div class="app-content-bg-color">
        <div class="container">
            <div class="jumbotron action-menu-container">
                <div class="panel panel-default">
                    <div class="panel-body app-panel-body-override" id="app-nav-toolbar">
                        <ul class="nav nav-pills pull-left">
                            <li class="app-menu-divider app-nav-menu-active" id="pill1">
                                <a href="#" class="action-menu-nav-pills">Hot Deals</a>
                            </li>

                            <li class="app-menu-divider app-nav-menu-inactive" id="pill2">
                                <a href="#" class="action-menu-nav-pills">Products</a>
                            </li>

                            <li class="app-menu-divider app-nav-menu-inactive" id="pill3">
                                <a href="#" class="action-menu-nav-pills">Tech Deals</a>
                            </li>
                            <li class="app-menu-divider app-nav-menu-inactive" id="pill4">
                                <a href="#" class="action-menu-nav-pills">Travel</a>
                            </li>
                            <li class="app-menu-divider app-nav-menu-inactive" id="pill5">
                                <a href="#" class="action-menu-nav-pills">Credit Cards</a>
                            </li>
                            <li class="app-menu-divider app-nav-menu-inactive" id="pill6">
                                <a href="#" class="action-menu-nav-pills">Coupons / Gift Cards </a>
                            </li>
                        </ul>

                        <div class="col-lg-4 pull-right search-container">
                            <div class="input-prepend">
                                <input class="col-lg-10 search-input" type="text" placeholder="Type here to Search">
                                <a class="btn btn-primary search-button">
                                    <span class="add-on"><i class="fa fa-search"></i></span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <div class="container">
            <!-- Carousel-->
            <div id="carousel-example-captions" class="carousel slide bs-docs-carousel-example">
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-captions" data-slide-to="0"></li>
                    <li data-target="#carousel-example-captions" data-slide-to="1"></li>
                    <li data-target="#carousel-example-captions" data-slide-to="2" class="active"></li>

                </ol>
                <div class="carousel-inner">
                    <div class="item">
                        <img src="resources/dist/custom/images/showcase1.jpg">

                        <div class="carousel-caption">
                            <h3>Second slide label</h3>

                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="resources/dist/custom/images/showcase2.jpeg">

                        <div class="carousel-caption">
                            <h3>Second slide label</h3>

                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
                    <div class="item active">
                        <img src="resources/dist/custom/images/iphone3.jpg">

                        <div class="carousel-caption">
                            <h3>Third slide label</h3>

                            <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="resources/dist/custom/images/iphone4.jpg">

                        <div class="carousel-caption">
                            <h3>Third slide label</h3>

                            <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-example-captions" data-slide="prev">
                    <span class="icon-prev"></span>
                </a>
                <a class="right carousel-control" href="#carousel-example-captions" data-slide="next">
                    <span class="icon-next"></span>
                </a>
            </div>
            <!-- /.carousel -->
        </div>
    </div>
</div>