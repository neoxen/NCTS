<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="nctsApplicationList.title"/></title>
    <meta name="heading" content="<fmt:message key='nctsApplicationList.heading'/>"/>
    <meta name="menu" content="NctsApplicationMenu"/>
</head>

<c:set var="buttons">
    <input type="button" style="margin-right: 5px" class="button"
        onclick="location.href='<c:url value="/editNctsApplication.html"/>'"
        value="<fmt:message key="button.add"/>"/>

    <input type="button" class="button" onclick="location.href='<c:url value="/mainMenu.html"/>'"
        value="<fmt:message key="button.done"/>"/>
</c:set>

<c:out value="${buttons}" escapeXml="false" />

<display:table name="nctsApplications" class="table" requestURI="" id="nctsApplicationList" export="false" pagesize="25">
    <display:column property="siteAddress" sortable="true" titleKey="nctsApplication.siteAddress" maxLength="10"/>
    <display:column property="siteName" sortable="true" titleKey="nctsApplication.siteName" maxLength="10"/>

    <display:column property="applyType" sortable="true" titleKey="nctsApplication.applyType" maxLength="5"/>

    <display:column property="auditStatus" sortable="true" titleKey="nctsApplication.auditStatus" maxLength="5"/>

    <display:column property="isValid" sortable="true" titleKey="nctsApplication.isValid" maxLength="5"/>
    <display:column property="siteType" sortable="true" titleKey="nctsApplication.siteType" maxLength="5"/>


    <display:setProperty name="paging.banner.item_name"><fmt:message key="nctsApplicationList.nctsApplication"/></display:setProperty>
    <display:setProperty name="paging.banner.items_name"><fmt:message key="nctsApplicationList.nctsApplications"/></display:setProperty>


</display:table>

<c:out value="${buttons}" escapeXml="false" />

<script type="text/javascript">
    highlightTableRows("nctsApplicationList");
</script>
