<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="nctsElecidentifyList.title"/></title>
    <meta name="heading" content="<fmt:message key='nctsElecidentifyList.heading'/>"/>
    <meta name="menu" content="NctsElecidentifyMenu"/>
</head>

<!--c:set var="buttons">
    <input type="button" style="margin-right: 5px" class="button"
        onclick="location.href='<c url value="/editNctsElecidentify.html"/>'"
        value="<fmt message key="button.add"/>"/>

    <input type="button" class="button" onclick="location.href='<c url value="/mainMenu.html"/>'"
        value="<fmt message key="button.done"/>"/>
</c set-->

<c:out value="${buttons}" escapeXml="false" />

<display:table name="nctsElecidentifies" class="table" requestURI="" id="nctsElecidentifyList" export="false" pagesize="25">
    <display:column property="identifyId" sortable="true" href="editNctsElecidentify.html" media="html"
        paramId="identifyId" paramProperty="identifyId" titleKey="nctsElecidentify.identifyId"/>

    <display:column property="applyId" sortable="true" titleKey="nctsElecidentify.applyId"/>
    <display:column property="createDate" sortable="true" titleKey="nctsElecidentify.createDate"/>
    <display:column property="destroyDate" sortable="true" titleKey="nctsElecidentify.destroyDate"/>
    <display:column property="identifyCode" sortable="true" titleKey="nctsElecidentify.identifyCode"/>
    <display:column property="isValid" sortable="true" titleKey="nctsElecidentify.isValid"/>
    <display:column property="siteDomains" sortable="true" titleKey="nctsElecidentify.siteDomains"/>
    <display:column property="snbxh" sortable="true" titleKey="nctsElecidentify.snbxh"/>
    <display:column property="version" sortable="true" titleKey="nctsElecidentify.version"/>

    <display:setProperty name="paging.banner.item_name"><fmt:message key="nctsElecidentifyList.nctsElecidentify"/></display:setProperty>
    <display:setProperty name="paging.banner.items_name"><fmt:message key="nctsElecidentifyList.nctsElecidentifies"/></display:setProperty>


</display:table>

<!-- c out value="USD {buttons}" escapeXml="false" /-->

<script type="text/javascript">
    highlightTableRows("nctsElecidentifyList");
</script>
