/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package edu.pku.sei.wusj.ide.inject;

import com.google.gwt.inject.client.AbstractGinModule;
import edu.pku.sei.wusj.ide.view.HelloWorldView;
import edu.pku.sei.wusj.ide.view.HelloWorldViewImpl;
import org.eclipse.che.ide.api.extension.ExtensionGinModule;

/** @author Mathias Schaefer <mathias.schaefer@eclipsesource.com> */
@ExtensionGinModule
public class HelloWorldViewExampleGinModule extends AbstractGinModule {

  @Override
  protected void configure() {
    bind(HelloWorldView.class).to(HelloWorldViewImpl.class);
  }
}
