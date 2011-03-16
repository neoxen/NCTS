<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="userList.title"/></title>
    <meta name="heading" content="<fmt:message key='userList.heading'/>"/>
    <meta name="menu" content="AdminMenu"/>
</head>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px"
        onclick="location.href='<c:url value="/editUser.html?method=Add&from=list"/>'"
        value="<fmt:message key="button.add"/>"/>
    
    <input type="button" onclick="location.href='<c:url value="/mainMenu.html"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false" />

<display:table name="users" cellspacing="0" cellpadding="0" requestURI="" 
    defaultsort="1" id="users" pagesize="25" class="table" export="false">
    <display:column property="username" escapeXml="true" sortable="true" titleKey="user.username" style="width: 15%"
        url="/editUser.html?from=list" paramId="id" paramProperty="id"/>
    <display:column property="website" escapeXml="true" sortable="true" titleKey="user.website" style="width: 45%"/>
    <display:column property="firstName" escapeXml="true" sortable="true" titleKey="user.firstName" style="width: 17%"/>
    <display:column property="lastName" escapeXml="true" sortable="true" titleKey="user.lastName" style="width: 18%"/>
    <display:column sortProperty="enabled" sortable="true" titleKey="user.enabled" style="width: 5%; padding-left: 15px" media="html">
        <input type="checkbox" disabled="disabled" <c:if test="${users.enabled}">checked="checked"</c:if>/>
    </display:column>
    <display:column property="enabled" titleKey="user.enabled" media="csv xml excel pdf"/>

    <display:setProperty name="paging.banner.item_name" value="user"/>
    <display:setProperty name="paging.banner.items_name" value="users"/>

</display:table>

<c:out value="${buttons}" escapeXml="false" />

<script type="text/javascript">
    highlightTableRows("users");
</script>
