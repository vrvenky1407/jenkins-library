/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */

package org.zowe.jenkins_shared_library.pipelines.generic.arguments

/**
 * Represents the arguments available to the
 * {@link org.zowe.jenkins_shared_library.pipelines.generic.GenericPipeline#publishGeneric(java.util.Map)} method.
 */
class PublishStageArguments extends GenericStageArguments {
    /**
     * The name of the publishing step.
     *
     * @default {@code "Package"}
     */
    String name = "Package"

    /**
     * Artifacts to publish
     */
    List artifacts = []

    /**
     * Publishing target path
     */
    String publishTargetPath
}