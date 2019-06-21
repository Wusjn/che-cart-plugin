/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package edu.pku.sei.wusj.ide.view;

import org.eclipse.che.ide.api.mvp.View;
import org.eclipse.che.ide.api.parts.base.BaseActionDelegate;

/** @author Mathias Schaefer <mathias.schaefer@eclipsesource.com> */
public interface HelloWorldView extends View<HelloWorldView.ActionDelegate> {

  interface ActionDelegate extends BaseActionDelegate {}

  void sayHello(String content);

  void setVisible(boolean visible);
}
