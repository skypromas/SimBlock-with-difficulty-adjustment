/**
 * Copyright 2019 Distributed Systems Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package SimBlock.settings;

import java.math.BigDecimal;

public class SimulationConfiguration {
	public static final int NUM_OF_NODES = 9000;//600(doge);//800(lite);//6000(bitcoin);
	public static final String TABLE = "SimBlock.node.routingTable.BitcoinCoreTable";
	// Unit: millisecond
	public static BigDecimal INTERVAL = BigDecimal.valueOf(1000*60*10);//1000*60(doge);//1000*30*5(lite);//1000*60*10(bitcoin);
	// Mining power is the number of mining (hash calculation) executed per millisecond.
	public static  long AVERAGE_MINING_POWER = 100000; //400000 //1000000(2019)
	public static final int STDEV_OF_MINING_POWER = 50000;
	public static final int ENDBLOCKHEIGHT = 10000; //579972 2019-06-01 12:04 AM - 610638 2020-01-01 00:08 (30666)
	// Unit: byte
	public static final long BLOCKSIZE = 1000000;//6110(lite);//8000(doge);//535000(bitcoin);//0.5MB
	public static BigDecimal DIFFICULTY_INTERVAL = BigDecimal.valueOf(2016); //readjust difficulty once every N block
	public static final int CHANGE_MINING_POWER_INTERVAL = 0; //1(every block); 0(no changes)
	public static final double MINING_POWER_INCREASE_PERCENTAGE = 0.5; //the chance to increase
	public static final double MINING_POWER_CHANGE_RATIO = 0.2; //how much to increase or decrease
	public static final String SIMULATION_TYPE = "bitcoin"; //dogecoin; litecoin; bitcoin

	//For GA
	public static boolean runningGA = false;
	public static boolean firstGARun = true;
	public static BigDecimal TOTAL_PREVIOUS_BLOCK_HEIGHT = BigDecimal.ZERO;
	public static BigDecimal TOTAL_INTERVAL = BigDecimal.ZERO;
	public static int GA_START_BLOCK_HEIGHT = 0;
	public static int GA_END_BLOCK_HEIGHT = 0;
	public static int CURRENT_BLOCK_HEIGHT = 0;
	public static BigDecimal OLD_DIFFICULTY_INTERVAL = BigDecimal.ZERO;
	public static BigDecimal OLD_INTERVAL;
	public static BigDecimal NEW_DIFFICULTY_INTERVAL = BigDecimal.ZERO;
	public static BigDecimal NEW_INTERVAL = BigDecimal.ZERO;
	public static boolean GA_TRIGGERED = false;
	public static boolean FIRST_TIME = false;
	public static BigDecimal AVERAGE_DIFFICULTY = BigDecimal.ZERO;
	public static int PREVIOUS_DIFFICULTY_READJUST_HEIGHT = 0;
	public static boolean DIFFICULTY_ADJUSTED = true;
}