<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="mainMenu.title"/></title>
    <meta name="heading" content="<fmt:message key='mainMenu.heading'/>"/>
    <meta name="menu" content="MainMenu"/>
</head>

<p><fmt:message key="mainMenu.message"/></p>

<div class="separator"></div>

<ul class="glassList">
    <li>
        <a href="<c:url value='/editNctsApplication.html'/>"><fmt:message key="menu.user.nctsApplication"/></a>
    </li>
    <li>
        <a href="<c:url value='/nctsApplications.html'/>"><fmt:message key="menu.user.nctsApplicationList"/></a>
    </li>
    <li>
        <a href="<c:url value='/nctsElecidentifies.html'/>"><fmt:message key="menu.user.nctsElecidentifyList"/></a>
    </li>
</ul>