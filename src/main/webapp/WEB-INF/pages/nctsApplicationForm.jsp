<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="nctsApplicationDetail.title"/></title>
    <meta name="heading" content="<fmt:message key='nctsApplicationDetail.heading'/>"/>
</head>

<s:bean name="java.util.HashMap" id="qTableLayout" />


<s:form id="nctsApplicationForm" action="saveNctsApplication" method="post" validate="true">
    <li style="display: none">
        <s:hidden key="nctsApplication.applyId"/>
    </li>
    <li>
        <table>
            <s:textfield theme="qxhtml" key="nctsApplication.applyType" required="true" maxlength="1"
                         cssClass="text medium"/>

            <s:textfield theme="qxhtml" key="nctsApplication.auditComment" required="false" maxlength="200"
                         cssClass="text medium"/>

            <s:textfield theme="qxhtml" key="nctsApplication.auditStatus" required="true" maxlength="1"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.createDate" required="true" maxlength="10"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.currHandleDept" required="false" maxlength="32"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.currHandler" required="false" maxlength="32"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.destroyDate" required="true" maxlength="10"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.handleTime" required="false" maxlength="10"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.isValid" required="true" maxlength="1"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.nextHandleDept" required="false" maxlength="32"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.operId" required="false" maxlength="32"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteAddress" required="true" maxlength="100"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteDomains" required="true" maxlength="200"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteIcpno" required="true" maxlength="50"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteInfo" required="false" maxlength="200"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteIp" required="true" maxlength="15"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteIsp" required="true" maxlength="100"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteMail" required="true" maxlength="100"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteName" required="true" maxlength="100"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteOpenDay" required="true" maxlength="10"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.siteType" required="true" maxlength="1"
                         cssClass="text medium"/>
            <s:textfield theme="qxhtml" key="nctsApplication.snbxh" required="true" maxlength="30"
                         cssClass="text medium"/>
        </table>
    </li>
    <li class="buttonBar bottom">
        <s:submit cssClass="button" method="save" key="button.save" theme="simple"/>
        <c:if test="${not empty nctsApplication.applyId}">
            <s:submit cssClass="button" method="delete" key="button.delete"
                      onclick="return confirmDelete('NctsApplication')" theme="simple"/>
        </c:if>
        <s:submit cssClass="button" method="cancel" key="button.cancel" theme="simple"/>
    </li>
</s:form>

<script type="text/javascript">
    Form.focusFirstElement($("nctsApplicationForm"));
</script>
