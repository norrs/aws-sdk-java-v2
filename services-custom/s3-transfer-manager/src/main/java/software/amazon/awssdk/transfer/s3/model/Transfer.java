/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.transfer.s3.model;

import java.util.concurrent.CompletableFuture;
import software.amazon.awssdk.annotations.SdkPreviewApi;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.transfer.s3.model.CompletedTransfer;
import software.amazon.awssdk.transfer.s3.model.DirectoryTransfer;
import software.amazon.awssdk.transfer.s3.model.ObjectTransfer;

/**
 * Represents the upload or download of one or more objects to or from S3.
 * 
 * @see ObjectTransfer
 * @see DirectoryTransfer
 */
@SdkPublicApi
@SdkPreviewApi
public interface Transfer {
    /**
     * @return The future that will be completed when this transfer is complete.
     */
    CompletableFuture<? extends CompletedTransfer> completionFuture();
}
