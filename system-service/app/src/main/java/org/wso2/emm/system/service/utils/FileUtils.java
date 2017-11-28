/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.emm.system.service.utils;

import android.os.Environment;
import android.util.Log;

import java.io.File;

/**
 * Utility class to hold file manipulation methods.
 */
public class FileUtils {

    public static String getUpgradePackageDirectory(){
//        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        return Environment.getDownloadCacheDirectory().getPath();
    }

    public static String getUpgradePackageFilePath() {
        String path = getUpgradePackageDirectory();
        Log.d(FileUtils.class.getName(), path + File.separator + Constants.UPDATE_PACKAGE_NAME);
//        return getUpgradePackageDirectory() + File.separator + Constants.UPDATE_PACKAGE_NAME;
        return getUpgradePackageDirectory() + File.separator + "ota" + File.separator + Constants.UPDATE_PACKAGE_NAME;
    }

    public static String getOTAPackageFilePath() {
        String path = getUpgradePackageDirectory();
        return getUpgradePackageDirectory() + File.separator + "ota";
    }
}
