/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package edu.pku.sei.wusj.ide.view.client.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * JavaScript overlay to demonstrate a global js function call
 *
 * @author Mathias Schaefer <mathias.schaefer@eclipsesource.com>
 */
public class HelloWorldViewOverlay extends JavaScriptObject {

  protected HelloWorldViewOverlay() {}

  public static final native void sayHello(final Element element, String message) /*-{
        new $wnd.HelloWorld(element, message);
    }-*/;
}
