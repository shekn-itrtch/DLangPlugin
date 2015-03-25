package org.dlangplugin.ide.index;

import com.intellij.util.io.DataExternalizer;
import com.intellij.util.io.IOUtil;
import org.jetbrains.annotations.NotNull;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/* Save instance of DLangComponentInfo to index file and load. */
public class DLangComponentInfoExternalizer implements DataExternalizer<DLangComponentInfo> {
    private final byte[] buffer = IOUtil.allocReadWriteUTFBuffer();

    @Override
    public void save(@NotNull DataOutput out, DLangComponentInfo componentInfoInfo) throws IOException {
        IOUtil.writeUTFFast(buffer, out, componentInfoInfo.getName());
        IOUtil.writeUTFFast(buffer, out, componentInfoInfo.getModuleName());
        IOUtil.writeUTFFast(buffer, out, componentInfoInfo.getType().toString());
    }

    @Override
    public DLangComponentInfo read(@NotNull DataInput in) throws IOException {
        final String componentName = IOUtil.readUTFFast(buffer, in);
        final String moduleName = IOUtil.readUTFFast(buffer, in);
        final String componentTypeStr = IOUtil.readUTFFast(buffer, in);
        DLangComponentType componentType = DLangComponentType.valueOf(componentTypeStr);

        return new DLangComponentInfo(componentType, componentName, moduleName);
    }
}
