/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cocoon.servletservice.util;

import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

/**
 *
 * @version $Id: ServletConfigurationWrapper.java 608375 2008-01-03 08:33:00Z reinhard $
 * @since 1.0.0
 */
public class ServletConfigurationWrapper implements ServletConfig {

    protected ServletConfig servletConfig;

    protected ServletContext servletContext;

    /**
     * @param servletConfig
     */
    public ServletConfigurationWrapper(ServletConfig servletConfig) {
        this(servletConfig, null);
    }

    /**
     * @param servletConfig
     * @param servletContext
     */
    public ServletConfigurationWrapper(ServletConfig servletConfig,
                                       ServletContext servletContext) {
        this.servletConfig = servletConfig;
        this.servletContext = servletContext;
    }

    public String getServletName() {
        return this.servletConfig.getServletName();
    }

    public ServletContext getServletContext() {
        return this.servletContext != null ? this.servletContext
                : this.servletConfig.getServletContext();
    }

    public String getInitParameter(String name) {
        return this.servletConfig.getInitParameter(name);
    }

    public Enumeration getInitParameterNames() {
        return this.servletConfig.getInitParameterNames();
    }

}
