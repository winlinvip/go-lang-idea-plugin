package ro.redeul.google.go.resolve;

import org.junit.Ignore;

/**
 * Author: Toader Mihai Claudiu <mtoader@gmail.com>
 * <p/>
 * Date: Sep 8, 2010
 * Time: 2:59:17 PM
 */
public class GoResolveVarsTest extends GoPsiResolveTestCase {

    @Override
    protected String getTestDataRelativePath() {
        return super.getTestDataRelativePath() + "vars/";
    }

    public void testDeclaredInForRange() throws Exception {
        doTest();
    }

    public void testDeclaredInForRange2() throws Exception {
        doTest();
    }

    public void testDeclaredInForRangeAsValue() throws Exception {
        doTest();
    }

    public void testDeclaredInForClause() throws Exception {
        doTest();
    }

    public void testMethodReturn() throws Exception {
        doTest();
    }

    public void testSimpleMethodParameter() throws Exception {
        doTest();
    }

    public void testMethodReturn2() throws Exception {
        doTest();
    }

    public void testResolveMethodReceiver() throws Exception {
        doTest();
    }

    public void testGlobalVarDeclaration() throws Exception {
        doTest();
    }

    public void testGlobalShadowedVarDeclaration() throws Exception {
        doTest();
    }

    public void testGlobalVarDeclarationFromBlock() throws Exception {
        doTest();
    }

    public void testShortVarDeclaration() throws Exception {
        doTest();
    }

    public void testShortVarRedeclaration() throws Exception {
        doTest();
    }

    public void testShortVarDeclarationFromBlock() throws Exception {
        doTest();
    }

    public void testGlobalConstDeclaration() throws Exception {
        doTest();
    }

    public void testFromDefaultImportedPackage() throws Exception {
        doTest();
    }

    public void testFromInjectedImportedPackage() throws Exception {
        doTest();
    }

    public void testDefaultImportDifferentPackage() throws Exception {
        doTest();
    }

    public void testFromCustomImportedPackage() throws Exception {
        doTest();
    }

    public void testResolveToMethodName() throws Exception {
        doTest();
    }

    public void testResolveToFunctionName() throws Exception {
        doTest();
    }

    public void testLocalConstDeclaration() throws Exception {
        doTest();
    }

    public void testChainedSelector() throws Exception {
        doTest();
    }

    public void testVarInSwitchExpr() throws Exception {
        doTest();
    }

    public void testVarInSwitchExprInitialization() throws Exception {
        doTest();
    }

    public void testVarInSwitchType() throws Exception {
        doTest();
    }

    public void testVarInSwitchTypeInitialization() throws Exception {
        doTest();
    }

    public void testVarInSwitchTypeWithNamedSwitchGuard() throws Exception {
        doTest();
    }

    public void testMultipleGlobalVars() throws Exception {
        doTest();
    }

    public void testMultipleGlobalConsts() throws Exception {
        doTest();
    }

    public void testDeclarationInsideLabeledStatement() throws Exception {
        doTest();
    }

    public void testMultipleApplications() throws Exception {
        doTest();
    }

    public void testStructFieldViaChannel() throws Exception {
        doTest();
    }

    public void testAnonymousFunctionInvocation() throws Exception {
        doTest();
    }

    public void testShortVarDeclarationFromSelectClause() throws Exception {
        doTest();
    }

    public void testVarDeclarationInSelectCommClauseRecv() throws Exception {
        doTest();
    }

    public void testVarDeclarationInSelectCommClauseSend() throws Exception {
        doTest();
    }

    public void testVarDeclarationInSelectCommClauseDefault() throws Exception {
        doTest();
    }

    public void testLocalPackageDefinitionsShouldBeResolvedFirst() throws Exception {
        doTest();
    }

    public void testRangeExpressionVarsShouldNotResolveToRangeVars() throws Exception {
        doTest();
    }

    @Ignore("short var resolution is broken")
    public void testShortAssignToReturnVar() throws Exception {
        doTest();
    }

    @Ignore("Failing as it needs some care when looking at a parsing corner case: aka is not trivial. See #865")
    public void testVarDereferenceAsTypeCast() throws Exception {
        doTest();
    }
}
