package com.xiaohao.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Set;

/**
 * Created by xiaohao on 2016/4/20.
 */
public class MyJdbcRealm extends JdbcRealm {

    @Override
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    @Override
    public void setAuthenticationQuery(String authenticationQuery) {
        super.setAuthenticationQuery(authenticationQuery);
    }

    @Override
    public void setUserRolesQuery(String userRolesQuery) {
        super.setUserRolesQuery(userRolesQuery);
    }

    @Override
    public void setPermissionsQuery(String permissionsQuery) {
        super.setPermissionsQuery(permissionsQuery);
    }

    @Override
    public void setPermissionsLookupEnabled(boolean permissionsLookupEnabled) {
        super.setPermissionsLookupEnabled(permissionsLookupEnabled);
    }

    @Override
    public void setSaltStyle(SaltStyle saltStyle) {
        super.setSaltStyle(saltStyle);
    }

    @Override
    protected String getSaltForUser(String username) {
        return super.getSaltForUser(username);
    }

    @Override
    protected Set<String> getPermissions(Connection conn, String username, Collection<String> roleNames) throws SQLException {
        return super.getPermissions(conn, username, roleNames);
    }

    @Override
    protected Set<String> getRoleNamesForUser(Connection conn, String username) throws SQLException {
        return super.getRoleNamesForUser(conn, username);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return super.doGetAuthorizationInfo(principals);
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return super.doGetAuthenticationInfo(token);
    }
}
