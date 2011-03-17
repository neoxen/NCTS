<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="nctsUserDetail.title"/></title>
    <meta name="heading" content="<fmt:message key='nctsUserDetail.heading'/>"/>
</head>

<s:form id="nctsUserForm" action="saveNctsUser" method="post" validate="true">
    <li style="display: none">
        <s:hidden key="nctsUser.userId"/>
    </li>
<li>
    <s:checkbox key="nctsUser.isOpened" cssClass="checkbox" theme="simple"/>
    <!-- For some reason, key prints out the raw value for the label (i.e. true) instead of the i18n key: https://issues.apache.org/struts/browse/WW-1958-->
    <s:label for="nctsUserForm_nctsUser_isOpened" value="%{getText('nctsUser.isOpened')}" cssClass="choice desc" theme="simple"/>
</li>
<li>
    <s:checkbox key="nctsUser.isRepeat" cssClass="checkbox" theme="simple"/>
    <!-- For some reason, key prints out the raw value for the label (i.e. true) instead of the i18n key: https://issues.apache.org/struts/browse/WW-1958-->
    <s:label for="nctsUserForm_nctsUser_isRepeat" value="%{getText('nctsUser.isRepeat')}" cssClass="choice desc" theme="simple"/>
</li>
<li>
    <s:checkbox key="nctsUser.isScan" cssClass="checkbox" theme="simple"/>
    <!-- For some reason, key prints out the raw value for the label (i.e. true) instead of the i18n key: https://issues.apache.org/struts/browse/WW-1958-->
    <s:label for="nctsUserForm_nctsUser_isScan" value="%{getText('nctsUser.isScan')}" cssClass="choice desc" theme="simple"/>
</li>
<li>
    <s:checkbox key="nctsUser.isValid" cssClass="checkbox" theme="simple"/>
    <!-- For some reason, key prints out the raw value for the label (i.e. true) instead of the i18n key: https://issues.apache.org/struts/browse/WW-1958-->
    <s:label for="nctsUserForm_nctsUser_isValid" value="%{getText('nctsUser.isValid')}" cssClass="choice desc" theme="simple"/>
</li>
    <s:textfield key="nctsUser.password" required="true" maxlength="32" cssClass="text medium"/>
    <s:textfield key="nctsUser.sfzrxm" required="true" maxlength="500" cssClass="text medium"/>
    <s:textfield key="nctsUser.snbxh" required="false" maxlength="30" cssClass="text medium"/>
    <s:textfield key="nctsUser.sqymc" required="true" maxlength="100" cssClass="text medium"/>
    <s:textfield key="nctsUser.szch" required="true" maxlength="40" cssClass="text medium"/>
    <s:textfield key="nctsUser.userName" required="true" maxlength="20" cssClass="text medium"/>

    <li class="buttonBar bottom">
        <s:submit cssClass="button" method="save" key="button.save" theme="simple"/>
        <c:if test="${not empty nctsUser.userId}">
            <s:submit cssClass="button" method="delete" key="button.delete"
                onclick="return confirmDelete('NctsUser')" theme="simple"/>
        </c:if>
        <s:submit cssClass="button" method="cancel" key="button.cancel" theme="simple"/>
    </li>
</s:form>

<script type="text/javascript">
    Form.focusFirstElement($("nctsUserForm"));
</script>
