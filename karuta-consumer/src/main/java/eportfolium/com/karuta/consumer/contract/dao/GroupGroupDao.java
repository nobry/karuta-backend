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

package eportfolium.com.karuta.consumer.contract.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;

import eportfolium.com.karuta.model.bean.GroupGroup;
import eportfolium.com.karuta.model.exception.DoesNotExistException;

public interface GroupGroupDao {

	void persist(GroupGroup transientInstance);

	void remove(GroupGroup persistentInstance);

	GroupGroup merge(GroupGroup detachedInstance);

	GroupGroup findById(Serializable id) throws DoesNotExistException;

	ResultSet findAll(String table, Connection con);

	void removeAll();

}