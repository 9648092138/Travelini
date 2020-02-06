package co.travelini.backendservices.util;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/** Cache class to build cache and to add, get values to cache */
public class GauvaCache<K, V> {

	/** loading Cache instance */
	private LoadingCache<K, V> cache;

	/**
	 * This will create cache with loader
	 * @param loader to load initial values
	 */
	public GauvaCache(CacheLoader<K, V> loader) {
		this.cache = CacheBuilder.newBuilder().build(loader);
	}

	/**
	 * This will create cache with customized cache specification in {@link CacheBuilderSpec}
	 * @param specs customized specification
	 * @param loader to load initial values
	 */
	public GauvaCache(CacheBuilderSpec specs, CacheLoader<K, V> loader) {
		this.cache = CacheBuilder.from(specs).build(loader);
	}

	/**
	 * This will create cache with customized cache specification in String format as "maximumSize=100, expireAfterAccess=10m"
	 * @param specsString specification in string format
	 * @param loader to load initial values 
	 */
	public GauvaCache(String specsString, CacheLoader<K, V> loader) {
		this.cache = CacheBuilder.from(specsString).build(loader);
	}

	/**
	 * This will create cache with customized cache specification provided as inputs
	 * @param cacheSize size of the cache
	 * @param expireTime time value for expiration
	 * @param expireTimeUnit time unit for expiration like minutes, seconds
	 * @param loader to load initial values
	 */
	public GauvaCache(int cacheSize, int expireTime, TimeUnit expireTimeUnit, CacheLoader<K, V> loader) {
		this.cache = CacheBuilder.newBuilder().maximumSize(cacheSize).expireAfterAccess(expireTime, expireTimeUnit)
				.build(loader);
	}

	/**
	 * To get the value from cache for input key
	 * @param key for which value to be fetched
	 * @return value of the key
	 * @throws ExecutionException exception occurred during execution
	 */
	public V get(K key) throws ExecutionException {
		return this.cache.get(key);
	}

	/**
	 * To add key-value pair in cache
	 * @param key key for cache
	 * @param value value of the key
	 */
	public void add(K key, V value) {
		this.cache.put(key, value);
	}
	
	public List<V> getAll() throws ExecutionException {
		return (List<V>) this.cache.asMap().values();
	}
}
