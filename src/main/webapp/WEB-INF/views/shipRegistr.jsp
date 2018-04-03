<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="calendar" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Регистрация доставки</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">

    <link rel="stylesheet" href="../../resources/css/demo.css">
    <link rel="stylesheet" href="../../resources/css/sky-forms.css">
    <link rel="stylesheet" href="../../resources/css/sky-forms-purple.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>


    <style type="text/css">
        @import url(http://fonts.googleapis.com/css?family=Roboto:400,500,300,700);

        body {
            background: -webkit-linear-gradient(left, #25c481, #25b7c4);
            background: linear-gradient(to right, #25c481, #25b7c4);
            font-family: 'Roboto', sans-serif;
        }
    </style>

    <![endif]-->

    <!--[if lt IE 10]>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="js/jquery.placeholder.min.js"></script>
    <![endif]-->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <script src="js/sky-forms-ie8.js"></script>
    <![endif]-->
</head>
<body>
<div class="body">
    <c:url var="addAction" value="/shippingRegistr/deploy"/>
    <form:form action="${addAction}" commandName="shipping" class="sky-form">
        <header>Регистрация доставки</header>

        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Адрес контракта обязательств выплаты</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="paymentAddress" rows="1"/>

                    </label>
                </section>
                <section class="col col-6">
                    <label class="label">Дата отправки товаров</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/calendrier.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="startDate" rows="1"/>
                    </label>
                </section>
            </div>

        </fieldset>

        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Участиники доставки</label>
                </section>
            </div>
        </fieldset>
        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Адрес кошелька</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="partyAddress" rows="1"/>

                    </label>
                </section>
                <section class="col col-6">
                    <label class="label">Принимающая сторона</label>
                    <label class="select">
                        <form:select path="partyImporter">
                            <option value="true">Импортера</option>
                            <option value="false">Экспортера</option>
                        </form:select>
                        <i></i>
                    </label>
                </section>
            </div>
        </fieldset>

        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="counterPartyAddress" rows="1"/>

                    </label>
                </section>
                <section class="col col-6">
                    <label class="select">
                        <form:select path="counterPartyImporter">
                            <option value="true">Импортера</option>
                            <option value="false">Экспортера</option>
                        </form:select>
                        <i></i>
                    </label>
                </section>
            </div>
        </fieldset>


        <footer>
            <button type="submit" class="button">Создать</button>
            <button type="button" class="button button-secondary" onclick="window.history.back();">Назад</button>
        </footer>
        <%--</form>--%>
    </form:form>

</div>
</body>
</html>