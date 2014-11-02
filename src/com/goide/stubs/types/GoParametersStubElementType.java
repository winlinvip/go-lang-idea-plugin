package com.goide.stubs.types;

import com.goide.psi.GoParameters;
import com.goide.psi.impl.GoParametersImpl;
import com.goide.stubs.GoParametersStub;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class GoParametersStubElementType extends GoStubElementType<GoParametersStub, GoParameters> {
  public GoParametersStubElementType(@NotNull String name) {
    super(name);
  }

  @NotNull
  @Override
  public GoParameters createPsi(@NotNull GoParametersStub stub) {
    return new GoParametersImpl(stub, this);
  }

  @NotNull
  @Override
  public GoParametersStub createStub(@NotNull GoParameters psi, StubElement parentStub) {
    return new GoParametersStub(parentStub, this, psi.getText());
  }

  @Override
  public void serialize(@NotNull GoParametersStub stub, @NotNull StubOutputStream dataStream) throws IOException {
    dataStream.writeName(stub.getText());
  }

  @NotNull
  @Override
  public GoParametersStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
    return new GoParametersStub(parentStub, this, dataStream.readName());
  }
}