/*
 ** Copyright (C) 2014 Mellanox Technologies
 **
 ** Licensed under the Apache License, Version 2.0 (the "License");
 ** you may not use this file except in compliance with the License.
 ** You may obtain a copy of the License at:
 **
 ** http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing, software
 ** distributed under the License is distributed on an "AS IS" BASIS,
 ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 ** either express or implied. See the License for the specific language
 ** governing permissions and  limitations under the License.
 **
 */

package com.mellanox.erasurecode.rawcoder;

import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureCoderFactory;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureDecoder;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

public class MellanoxRSRawErasureCoderFactory implements RawErasureCoderFactory {

	  @Override
	  public RawErasureEncoder createEncoder(int numDataUnits, int numParityUnits) {
	    return new MellanoxRSRawEncoder(numDataUnits, numParityUnits);
	  }

	  @Override
	  public RawErasureDecoder createDecoder(int numDataUnits, int numParityUnits) {
	    return new MellanoxRSRawDecoder(numDataUnits, numParityUnits);
	  }

}
