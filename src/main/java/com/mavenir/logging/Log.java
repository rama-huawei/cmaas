// Copyright 2020 Mavenir
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// automatically generated by the FlatBuffers compiler, do not modify

package org.xgvela.logging;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Log extends Table {
  public static Log getRootAsLog(ByteBuffer _bb) { return getRootAsLog(_bb, new Log()); }
  public static Log getRootAsLog(ByteBuffer _bb, Log obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Log __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String containerId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer containerIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer containerIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String containerName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer containerNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer containerNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String payload() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer payloadAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer payloadInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createLog(FlatBufferBuilder builder,
      int container_idOffset,
      int container_nameOffset,
      int payloadOffset) {
    builder.startObject(3);
    Log.addPayload(builder, payloadOffset);
    Log.addContainerName(builder, container_nameOffset);
    Log.addContainerId(builder, container_idOffset);
    return Log.endLog(builder);
  }

  public static void startLog(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addContainerId(FlatBufferBuilder builder, int containerIdOffset) { builder.addOffset(0, containerIdOffset, 0); }
  public static void addContainerName(FlatBufferBuilder builder, int containerNameOffset) { builder.addOffset(1, containerNameOffset, 0); }
  public static void addPayload(FlatBufferBuilder builder, int payloadOffset) { builder.addOffset(2, payloadOffset, 0); }
  public static int endLog(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishLogBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedLogBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

