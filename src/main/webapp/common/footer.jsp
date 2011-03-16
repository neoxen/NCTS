<%@ include file="/common/taglibs.jsp" %>

<div id="divider">
    <div></div>
</div>
<div style="float:left">
    <span class="left"><fmt:message key="webapp.version"/>
        <c:if test="${pageContext.request.remoteUser != null}">
            | <fmt:message key="user.status"/> ${pageContext.request.remoteUser}
        </c:if>
    </span>
</div>
<div style="float:right">
    <span>
        &copy; <fmt:message key="copyright.year"/> <a href="<fmt:message key="company.url"/>"><fmt:message
            key="company.name"/></a>
    </span>
</div>