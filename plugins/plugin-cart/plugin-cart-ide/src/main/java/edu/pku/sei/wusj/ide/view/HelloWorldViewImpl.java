/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package edu.pku.sei.wusj.ide.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import edu.pku.sei.wusj.ide.view.client.jso.HelloWorldViewOverlay;
import org.eclipse.che.ide.api.parts.base.BaseView;

/** @author Mathias Schaefer <mathias.schaefer@eclipsesource.com> */
public class HelloWorldViewImpl extends BaseView<HelloWorldView.ActionDelegate>
    implements HelloWorldView {

  interface HelloWorldViewImplUiBinder extends UiBinder<Widget, HelloWorldViewImpl> {}

  private static final HelloWorldViewImplUiBinder UI_BINDER =
      GWT.create(HelloWorldViewImplUiBinder.class);

  @UiField FlowPanel helloWorldPanel;

  @Inject
  public HelloWorldViewImpl() {
    setContentWidget(UI_BINDER.createAndBindUi(this));
  }

  @Override
  public void sayHello(String content) {
    HelloWorldViewOverlay.sayHello(helloWorldPanel.getElement(), content);
    helloWorldPanel.setVisible(true);
  }
}
