package com.xxgc.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;




public class ShiroRealm extends AuthenticatingRealm {

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usertoke = (UsernamePasswordToken) token;
		String username = usertoke.getUsername();
         if("unknow".equals(username)){
        	 throw new UnknownAccountException("用户名不存在");
         }
         Object principal=username;
         Object credentials="123";
         String realmName=this.getName();
         SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(principal, credentials, realmName);
         
		return info;
		
	}
	
}
