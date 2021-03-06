/* =======================================================
	Copyright 2020 - ePortfolium - Licensed under the
	Educational Community License, Version 2.0 (the "License"); you may
	not use this file except in compliance with the License. You may
	obtain a copy of the License at

	http://www.osedu.org/licenses/ECL-2.0

	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an "AS IS"
	BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
	or implied. See the License for the specific language governing
	permissions and limitations under the License.
   ======================================================= */

package eportfolium.com.karuta.business.contract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public interface FileManager {

	boolean sendFile(String sessionid, String backend, String user, String uuid, String lang, File file)
			throws Exception;

	boolean rewriteFile(String sessionid, String backend, String user, String uuid, String lang, File file)
			throws Exception;

	boolean updateResource(String sessionid, String backend, String uuid, String lang, String json) throws Exception;

	String[] findFiles(String directoryPath, String id);

	String unzip(String zipFile, String destinationFolder) throws FileNotFoundException, IOException;

	void transferDataTable(Connection con) throws SQLException;

	void removeData();

}
