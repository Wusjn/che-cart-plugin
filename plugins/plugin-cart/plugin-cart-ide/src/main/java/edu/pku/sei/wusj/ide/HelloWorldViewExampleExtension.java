/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package edu.pku.sei.wusj.ide;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.pku.sei.wusj.ide.action.HelloWorldAction;
import org.eclipse.che.ide.api.action.ActionManager;
import org.eclipse.che.ide.api.action.DefaultActionGroup;
import org.eclipse.che.ide.api.action.IdeActions;
import org.eclipse.che.ide.api.constraints.Constraints;
import org.eclipse.che.ide.api.extension.Extension;

/** @author Mathias Schaefer <mathias.schaefer@eclipsesource.com> */
@Extension(title = "Hello world from JavaScript example")
@Singleton
public class HelloWorldViewExampleExtension {

  @Inject
  private void configureActions(
      final ActionManager actionManager, final HelloWorldAction helloWorldAction) {

    DefaultActionGroup editorContextMenuGroup =
        (DefaultActionGroup) actionManager.getAction(IdeActions.GROUP_EDITOR_CONTEXT_MENU);

    actionManager.registerAction(helloWorldAction.ACTION_ID, helloWorldAction);
    editorContextMenuGroup.addAction(helloWorldAction, Constraints.LAST);
  }
}
