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
import software.amazon.awssdk.core.SdkResponse;

/**
 * A completed single object transfer.
 * 
 * @see CompletedFileUpload
 * @see CompletedFileDownload
 * @see CompletedUpload
 * @see CompletedDownload
 */
@SdkPublicApi
@SdkPreviewApi
public interface CompletedObjectTransfer extends CompletedTransfer {

    /**
     * Return the {@link SdkResponse} associated with this transfer
     */
    default SdkResponse response() {
        throw new UnsupportedOperationException();
    }
}
