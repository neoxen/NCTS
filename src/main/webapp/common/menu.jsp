<%@ include file="/common/taglibs.jsp"%>

<menu:useMenuDisplayer name="Velocity" config="cssHorizontalMenu.vm" permissions="rolesAdapter">
<ul id="primary-nav" class="menuList">
    <li class="pad">&nbsp;</li>
    <c:if test="${empty pageContext.request.remoteUser}"><li><a href="<c:url value="/login.jsp"/>" class="current"><fmt:message key="login.title"/></a></li></c:if>
    <menu:displayMenu name="MainMenu"/>
    <menu:displayMenu name="UserMenu"/>
    <menu:displayMenu name="CreateApplication"/>
    <menu:displayMenu name="ApplicationList"/>
    <menu:displayMenu name="ElecidentifyList"/>
    <menu:displayMenu name="ViewUsers"/>
    <menu:displayMenu name="AdminApplicationList"/>
    <menu:displayMenu name="AdminElecidentifyList"/>
    <menu:displayMenu name="ActiveUsers"/>
    <menu:displayMenu name="Logout"/>

    <!--NctsUser-START-->
    <!--menu displayMenu name="NctsUserMenu" /-->
    <!--NctsUser-END-->
</ul>
</menu:useMenuDisplayer>