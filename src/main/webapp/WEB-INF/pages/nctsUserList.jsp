<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="nctsUserList.title"/></title>
    <meta name="heading" content="<fmt:message key='nctsUserList.heading'/>"/>
    <meta name="menu" content="NctsUserMenu"/>
</head>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px" class="button"
        onclick="location.href='<c:url value="/editNctsUser.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" class="button" onclick="location.href='<c:url value="/mainMenu.html"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false" />

<display:table name="nctsUsers" class="table" requestURI="" id="nctsUserList" export="true" pagesize="25">
    <display:column property="userId" sortable="true" href="editNctsUser.html" media="html"
        paramId="userId" paramProperty="userId" titleKey="nctsUser.userId"/>
    <display:column property="userId" media="csv excel xml pdf" titleKey="nctsUser.userId"/>
    <display:column sortProperty="isOpened" sortable="true" titleKey="nctsUser.isOpened">
        <input type="checkbox" disabled="disabled" <c:if test="${nctsUserList.isOpened}">checked="checked"</c:if>/>
    </display:column>
    <display:column sortProperty="isRepeat" sortable="true" titleKey="nctsUser.isRepeat">
        <input type="checkbox" disabled="disabled" <c:if test="${nctsUserList.isRepeat}">checked="checked"</c:if>/>
    </display:column>
    <display:column sortProperty="isScan" sortable="true" titleKey="nctsUser.isScan">
        <input type="checkbox" disabled="disabled" <c:if test="${nctsUserList.isScan}">checked="checked"</c:if>/>
    </display:column>
    <display:column sortProperty="isValid" sortable="true" titleKey="nctsUser.isValid">
        <input type="checkbox" disabled="disabled" <c:if test="${nctsUserList.isValid}">checked="checked"</c:if>/>
    </display:column>
    <display:column property="password" sortable="true" titleKey="nctsUser.password"/>
    <display:column property="sfzrxm" sortable="true" titleKey="nctsUser.sfzrxm"/>
    <display:column property="snbxh" sortable="true" titleKey="nctsUser.snbxh"/>
    <display:column property="sqymc" sortable="true" titleKey="nctsUser.sqymc"/>
    <display:column property="szch" sortable="true" titleKey="nctsUser.szch"/>
    <display:column property="userName" sortable="true" titleKey="nctsUser.userName"/>

    <display:setProperty name="paging.banner.item_name"><fmt:message key="nctsUserList.nctsUser"/></display:setProperty>
    <display:setProperty name="paging.banner.items_name"><fmt:message key="nctsUserList.nctsUsers"/></display:setProperty>

    <display:setProperty name="export.excel.filename"><fmt:message key="nctsUserList.title"/>.xls</display:setProperty>
    <display:setProperty name="export.csv.filename"><fmt:message key="nctsUserList.title"/>.csv</display:setProperty>
    <display:setProperty name="export.pdf.filename"><fmt:message key="nctsUserList.title"/>.pdf</display:setProperty>
</display:table>

<c:out value="${buttons}" escapeXml="false" />

<script type="text/javascript">
    highlightTableRows("nctsUserList");
</script>
