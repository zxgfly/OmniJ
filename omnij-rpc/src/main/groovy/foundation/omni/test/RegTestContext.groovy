package foundation.omni.test

import com.msgilligan.bitcoinj.rpc.RpcURI
import com.msgilligan.bitcoinj.test.RegTestEnvironment
import foundation.omni.rpc.test.OmniTestClient
import org.bitcoinj.params.RegTestParams

/**
 *
 */
class RegTestContext {
    static setup(String user, String pass) {
        def client = new OmniTestClient(RegTestParams.get(), RpcURI.defaultRegTestURI, user, pass)
        def env = new RegTestEnvironment(client)
        def funder = new RegTestOmniFundingSource(client)
        return [client, env, funder]
    }
}
