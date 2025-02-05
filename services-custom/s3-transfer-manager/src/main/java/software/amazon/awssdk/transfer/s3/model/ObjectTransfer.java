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

import software.amazon.awssdk.annotations.SdkPreviewApi;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.transfer.s3.progress.TransferProgress;

/**
 * Represents the upload or download of a single object to or from S3.
 * 
 * @see FileUpload
 * @see FileDownload
 * @see Upload
 * @see Download
 */
@SdkPublicApi
@SdkPreviewApi
public interface ObjectTransfer extends Transfer {
    /**
     * The stateful {@link TransferProgress} associated with this transfer.
     */
    TransferProgress progress();
}
