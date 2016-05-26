package xyz.marcelo.enums;

public enum Config {

	J48("-C 0.25 -M 2"),

	MLP("-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a"),

	RBF("-N 2 -R 0.01 -L 1.0E-6 -C 2 -P 1 -E 1 -S 1"),

	RF("-P 100 -I 100 -num-slots 1 -K 0 -M 1.0 -V 0.001 -S 1"),

	SGD("-F 0 -L 0.01 -R 1.0E-4 -E 500 -C 0.001 -S 1"),

	SVM("-S 0 -K 2 -D 3 -G 0.0 -R 0.0 -N 0.5 -M 40.0 -C 1.0 -E 0.001 -P 0.1 -model /home/marcelovca90/Mestrado/weka-3-8-0 -seed 1");

	private final String value;

	private Config(final String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

}