/**
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 * You may obtain a copy of the License at

 *  http://www.zhuangxulin.com/licenses/LICENSE-1.0
  
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package com.zhuangxulin.tools.cassandra.cluster.test;

import me.prettyprint.cassandra.model.ConfigurableConsistencyLevel;
import me.prettyprint.cassandra.serializers.StringSerializer;
import me.prettyprint.hector.api.Cluster;
import me.prettyprint.hector.api.HConsistencyLevel;
import me.prettyprint.hector.api.Keyspace;
import me.prettyprint.hector.api.exceptions.HectorException;
import me.prettyprint.hector.api.factory.HFactory;
import me.prettyprint.hector.api.mutation.Mutator;
import me.prettyprint.hector.api.query.ColumnQuery;

/**
 * @author zhuangxulin2003 Dec 2, 2011
 */
public class ClientByHector extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread cbh1 = new ClientByHector();
		cbh1.start();
		Thread cbh2 = new ClientByHector();
		cbh2.start();
		Thread cbh3 = new ClientByHector();
		cbh3.start();
		Thread cbh4 = new ClientByHector();
		cbh4.start();
		Thread cbh5 = new ClientByHector();
		cbh5.start();
		Thread cbh6 = new ClientByHector();
		cbh6.start();
		Thread cbh7 = new ClientByHector();
		cbh7.start();
		Thread cbh8 = new ClientByHector();
		cbh8.start();
		Thread cbh9 = new ClientByHector();
		cbh9.start();
		Thread cbh10 = new ClientByHector();
		cbh10.start();
		
		
	}

	public void run() {
		String tempValue = "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz"
				+ "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz";
		ConfigurableConsistencyLevel consistencyLevel = new ConfigurableConsistencyLevel();
		consistencyLevel
				.setDefaultWriteConsistencyLevel(HConsistencyLevel.QUORUM);
		Cluster cluster = HFactory.getOrCreateCluster("Test Cluster",
				"192.168.0.211:9160");
		Keyspace keyspaceOperator = HFactory.createKeyspace("zhuangxulin",
				cluster, consistencyLevel);
		try {
			Mutator<String> mutator = HFactory.createMutator(keyspaceOperator,
					StringSerializer.get());
			for (int i = 200000; i < 300000; i++) {
				mutator.insert(
						"timestamp",
						"ludandan",
						HFactory.createStringColumn("count:" + i,
								System.currentTimeMillis() + ""));
				ColumnQuery<String, String, String> columnQuery = HFactory
						.createStringColumnQuery(keyspaceOperator);
				columnQuery.setColumnFamily("ludandan").setKey("thread:"+Math.random()+"-count:" + i)
						.setName(tempValue + "timestamp");
				columnQuery.execute();
				System.out.println("count:" + i);
			}
		} catch (HectorException e) {
			e.printStackTrace();
		}
		cluster.getConnectionManager().shutdown();
	}

}
