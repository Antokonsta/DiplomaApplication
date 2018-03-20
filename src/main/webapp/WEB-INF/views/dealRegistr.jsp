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
    <title>Регистрация сделки торгового финансирования</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">

    <link rel="stylesheet" href="../../resources/css/demo.css">
    <link rel="stylesheet" href="../../resources/css/sky-forms.css">
    <link rel="stylesheet" href="../../resources/css/sky-forms-purple.css">

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
    <c:url var="addAction" value="/dealRegistration/deploy"/>
    <form:form action="${addAction}" commandName="deal" class="sky-form">
        <%-- <form action="${addAction}"  method="post" class="sky-form">--%>
        <header>Регистрация сделки</header>

        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Данные инициатора</label>
                </section>

            </div>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Номер кошелька</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="initiatorWallet" rows="1"/>

                    </label>
                </section>
                <section class="col col-6">
                    <label class="label">Роль</label>
                    <label class="select">
                        <form:select path="initiatorImporter">
                            <option value="0" selected disabled>Роль инициатора</option>
                            <option value="true">Импортер</option>
                            <option value="false">Экспортер</option>
                        </form:select>
                        <i></i>
                    </label>
                </section>
            </div>

        </fieldset>

        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Данные по сделке</label>

                </section>
            </div>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Сумма сделки</label>
                    <label class="input">
                        <i class="icon-prepend"> <img src='../../resources/img/money.png' border="0" width="20"
                                                      height="20"></i>
                        <form:input path="dealPrice"/>
                    </label>
                </section>
                <section class="col col-6">
                    <label class="label">Дата заключения</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/calendrier.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="dealDate" rows="1"/>
                    </label>
                </section>
            </div>

            <div class="row">
                <section class="col col-6">
                    <label class="label">Подробное описание товара</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="dealDesc" rows="1"/>

                    </label>
                </section>
                <section class="col col-6">
                    <label class="label">Кошелек Экспортера/Импортера</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="counterPartyWallet" rows="1"/>

                    </label>
                </section>
            </div>
        </fieldset>
        <fieldset>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Остальные участники</label>

                </section>
            </div>
            <div class="row">
                <section class="col col-6">
                    <label class="label">Кошелек Банка Импортера</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="importerBankWallet" rows="1"/>

                    </label>
                </section>
                <section class="col col-6">
                    <label class="label">Кошелек Банка Экспортера</label>
                    <label class="textarea">
                        <i class="icon-prepend"> <img src='../../resources/img/images.png' border="0" width="20"
                                                      height="20"></i>
                        <form:textarea path="exporterBankWallet" rows="1"/>

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