package com.user.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.user.wrapper.RequestWrapper;

@Component
public class UserFilter extends OncePerRequestFilter {

	private static Logger logger = LoggerFactory.getLogger(UserFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		logger.info("request reached into filter");
		RequestWrapper wrappedRequest = new RequestWrapper(request);

		filterChain.doFilter(wrappedRequest, response);

	}

}
