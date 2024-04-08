package net.minecraft.world.gen.layer;

/**+
 * This portion of EaglercraftX contains deobfuscated Minecraft 1.8 source code.
 * 
 * Minecraft 1.8.8 bytecode is (c) 2015 Mojang AB. "Do not distribute!"
 * Mod Coder Pack v9.18 deobfuscation configs are (c) Copyright by the MCP Team
 * 
 * EaglercraftX 1.8 patch files (c) 2022-2024 lax1dude, ayunami2000. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class GenLayerSmooth extends GenLayer {
	public GenLayerSmooth(long parLong1, GenLayer parGenLayer) {
		super(parLong1);
		super.parent = parGenLayer;
	}

	/**+
	 * Returns a list of integer values generated by this layer.
	 * These may be interpreted as temperatures, rainfall amounts,
	 * or biomeList[] indices based on the particular GenLayer
	 * subclass.
	 */
	public int[] getInts(int i, int j, int k, int l) {
		int i1 = i - 1;
		int j1 = j - 1;
		int k1 = k + 2;
		int l1 = l + 2;
		int[] aint = this.parent.getInts(i1, j1, k1, l1);
		int[] aint1 = IntCache.getIntCache(k * l);

		for (int i2 = 0; i2 < l; ++i2) {
			for (int j2 = 0; j2 < k; ++j2) {
				int k2 = aint[j2 + 0 + (i2 + 1) * k1];
				int l2 = aint[j2 + 2 + (i2 + 1) * k1];
				int i3 = aint[j2 + 1 + (i2 + 0) * k1];
				int j3 = aint[j2 + 1 + (i2 + 2) * k1];
				int k3 = aint[j2 + 1 + (i2 + 1) * k1];
				if (k2 == l2 && i3 == j3) {
					this.initChunkSeed((long) (j2 + i), (long) (i2 + j));
					if (this.nextInt(2) == 0) {
						k3 = k2;
					} else {
						k3 = i3;
					}
				} else {
					if (k2 == l2) {
						k3 = k2;
					}

					if (i3 == j3) {
						k3 = i3;
					}
				}

				aint1[j2 + i2 * k] = k3;
			}
		}

		return aint1;
	}
}