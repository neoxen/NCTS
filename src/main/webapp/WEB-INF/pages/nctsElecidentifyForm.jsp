<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="nctsElecidentifyDetail.title"/></title>
    <meta name="heading" content="<fmt:message key='nctsElecidentifyDetail.heading'/>"/>
</head>

<s:bean name="java.util.HashMap" id="qTableLayout" />

<s:form id="nctsElecidentifyForm" action="saveNctsElecidentify" method="post" validate="true">
    <li style="display: none">
        <s:hidden key="nctsElecidentify.identifyId"/>
    </li>
    <li>
        <table>
            <s:textfield theme="qxhtml" key="nctsElecidentify.siteDomains" required="true" maxlength="200"
                         cssClass="text medium" maxLength="40"/>
            <s:textfield theme="qxhtml" key="nctsElecidentify.createDate" required="true" maxlength="10"
                         cssClass="text medium"/>

            <s:textfield theme="qxhtml" key="nctsElecidentify.identifyCode" required="true" maxlength="50"
                         cssClass="text medium" maxLength="10"/>


            <s:textfield theme="qxhtml" key="nctsElecidentify.snbxh" required="true" maxlength="30"
                         cssClass="text medium" maxLength="10"/>
            <s:textfield theme="qxhtml" key="nctsElecidentify.isValid" required="true" maxlength="1"
                         cssClass="text medium" maxLength="5"/>
        </table>
    </li>
    <li class="buttonBar bottom">
        <s:submit cssClass="button" method="save" key="button.save" theme="simple"/>
        <c:if test="${not empty nctsElecidentify.identifyId}">
            <s:submit cssClass="button" method="delete" key="button.delete"
                      onclick="return confirmDelete('NctsElecidentify')" theme="simple"/>
        </c:if>
        <s:submit cssClass="button" method="cancel" key="button.cancel" theme="simple"/>
    </li>
</s:form>

<script type="text/javascript">
    Form.focusFirstElement($("nctsElecidentifyForm"));
</script>
